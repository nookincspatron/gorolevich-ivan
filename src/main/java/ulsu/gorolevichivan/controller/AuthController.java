package ulsu.gorolevichivan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ulsu.gorolevichivan.config.jwt.JwtProvider;
import ulsu.gorolevichivan.request.AuthRequest;
import ulsu.gorolevichivan.response.AuthResponse;
import ulsu.gorolevichivan.response.Response;
import ulsu.gorolevichivan.response.StatusResponse;
import ulsu.gorolevichivan.service.UserService;

@RestController
@RequestMapping(path = "/auth")
public class AuthController {

    private final UserService userService;
    private final JwtProvider jwtProvider;

    @Autowired
    public AuthController(
            UserService userService,
            JwtProvider jwtProvider
    ) {
        this.userService = userService;
        this.jwtProvider = jwtProvider;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Response> auth(
            @RequestBody AuthRequest authRequest
    ) {
        boolean match = userService.verify(
                authRequest.getUsername(),
                authRequest.getPassword()
        );
        if (match) {
            return new ResponseEntity<>(AuthResponse.success(jwtProvider.generateToken(authRequest.getUsername())), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(StatusResponse.error(), HttpStatus.BAD_REQUEST);
        }
    }
}