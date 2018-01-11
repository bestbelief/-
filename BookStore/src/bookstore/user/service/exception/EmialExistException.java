package bookstore.user.service.exception;

public class EmialExistException extends RegistException{

    @Override
    public String getMessage() {
        return "邮箱已经使用";
    }
}
