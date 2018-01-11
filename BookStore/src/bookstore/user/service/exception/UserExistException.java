package bookstore.user.service.exception;

public class UserExistException extends RegistException {

    @Override
    public String getMessage() {
        return "用户名已存在";
    }
}
