package bookstore.user.service.exception;

public class StateFalseException extends LoginException {

    @Override
    public String getMessage() {
        return "您的状态未激活，请先激活再登陆";
    }
}
