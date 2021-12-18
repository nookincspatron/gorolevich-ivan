package ulsu.gorolevichivan.response;

public class StatusResponse implements Response {

    public static final String STATUS_SUCCESS = "success";
    public static final String MESSAGE_SUCCESS = "Операция выполнена успешно";
    public static final String STATUS_ERROR = "error";
    public static final String MESSAGE_ERROR = "Не удалось выполнить операцию";

    public String status;
    public String message;

    public StatusResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public static StatusResponse success() {
        return new StatusResponse(StatusResponse.STATUS_SUCCESS, MESSAGE_SUCCESS);
    }

    public static StatusResponse error() {
        return new StatusResponse(StatusResponse.STATUS_ERROR, MESSAGE_ERROR);
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