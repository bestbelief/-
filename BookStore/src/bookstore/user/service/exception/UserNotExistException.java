package bookstore.user.service.exception;

public class UserNotExistException extends LoginException {

    @Override
    public String getMessage() {
        return "用户名已存在";
    }
}
