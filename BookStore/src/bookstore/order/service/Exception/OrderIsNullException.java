package bookstore.order.service.Exception;

public class OrderIsNullException extends OrderException {

    @Override
    public String getMessage() {
        return "你的订单为空";
    }
}
