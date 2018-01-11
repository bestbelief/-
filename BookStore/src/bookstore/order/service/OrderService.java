package bookstore.order.service;

import bookstore.order.dao.OrderDao;
import bookstore.order.domain.Order;
import bookstore.order.service.Exception.OrderIsNullException;

public class OrderService  {

    private OrderDao orderDao = new OrderDao();
    public void add(Order order){
        if(order != null){
            orderDao.addOrder(order);
        }else {
            try {
                throw new OrderIsNullException();
            } catch (OrderIsNullException e) {
                e.printStackTrace();
            }
        }

    }

}
