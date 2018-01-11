package bookstore.user.service.exception;

public class PasswordNotMatchException extends LoginException {

    @Override
    public String getMessage() {
        return "密码错误";
    }
}
