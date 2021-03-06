package ulsu.gorolevichivan.response;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class AuthResponse extends StatusResponse {

    public String type;
    public String token;
    public Date expires_in;

    public AuthResponse(String status, String message, String type, String token, Date expires_in) {
        super(status, message);
        this.type = type;
        this.token = token;
        this.expires_in = expires_in;
    }

    public static AuthResponse success(String token) {
        return new AuthResponse(StatusResponse.STATUS_SUCCESS, MESSAGE_SUCCESS, "Bearer", token, Date.from(LocalDate.now().plusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}