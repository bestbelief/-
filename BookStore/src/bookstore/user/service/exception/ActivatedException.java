package bookstore.user.service.exception;

public class ActivatedException extends RegistException {

    @Override
    public String getMessage() {
        return "你的账号已经激活";
    }
}
