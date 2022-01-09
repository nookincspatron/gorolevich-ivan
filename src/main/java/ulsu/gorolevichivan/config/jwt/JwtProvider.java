package ulsu.gorolevichivan.config.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Component
public class JwtProvider {

    @Value("$(jwt.secret)")
    private String jwtSecret;

    PrivateKey privateKey = PrivateKeyReader.get("/Users/nookincspatron/Documents/gorolevich-ivan/src/main/resources/private_key.der");
    PublicKey publicKey = PublicKeyReader.get("/Users/nookincspatron/Documents/gorolevich-ivan/src/main/resources/public_key.der");

    public String generateToken(String username) {
        Date date = Date.from(LocalDate.now().plusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        return Jwts.builder()
                .setSubject(username)
                .setExpiration(date)
                .signWith(SignatureAlgorithm.RS256, privateKey)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(publicKey).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getUsernameFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
        return claims.getSubject();
    }

    public JwtProvider() throws Exception {
    }
}