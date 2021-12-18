package ulsu.gorolevichivan.util;

public class Message {

    //Request
    public static final String INVALID_EMAIL = "Пользователь с такой почтой уже существует";
    public static final String INVALID_USERNAME = "Пользователь с таким именем пользователя уже существует";
    public static final String INVALID_DIVISION = "Отдел с такими параметрами уже существует";
    public static final String INVALID_POSITION = "Должность с такими параметрами уже существует";

    public static String invalidParameter(String parameter) {
        return "Обязательный параметр \"" + parameter + "\" не заполнен";
    }
}