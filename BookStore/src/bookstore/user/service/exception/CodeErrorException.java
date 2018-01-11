package bookstore.user.service.exception;

public class CodeErrorException extends RegistException {

    @Override
    public String getMessage() {
        return "激活码错误";
    }
}
