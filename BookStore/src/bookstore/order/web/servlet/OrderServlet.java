package bookstore.order.web.servlet;
import bookstore.cart.domain.Cart;
import bookstore.cart.domain.CartItem;
import bookstore.order.domain.Order;
import bookstore.order.domain.OrderItem;
import bookstore.order.service.OrderService;
import bookstore.user.domain.User;
import bookstore.util.BaseServlet;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@WebServlet(name ="OrderServlet" ,urlPatterns ="/order" )
public class OrderServlet extends BaseServlet {

    private OrderService orderService = new OrderService();
    private OrderItem orderItem =new OrderItem();
    public String add(HttpServletRequest request,HttpServletResponse response){
      HttpSession session = request.getSession();
       Cart cart = (Cart) session.getAttribute("cart");
        Map<String, CartItem> map = cart.getMap();
        for (String bid:map.keySet()) {
           orderItem.setBid(map.get(bid).getBook().getBid());
           orderItem.setCount(map.get(bid).getCount());
           String uuid = UUID.randomUUID().toString().replaceAll("-", "");
           orderItem.setOid(uuid);
           orderItem.setIid(uuid);
            int subtotal =Integer.parseInt(map.get(bid).getCount()) *
                    Integer.parseInt(map.get(bid).getBook().getPrice());
        }
        request.setAttribute("orderItem",orderItem);
        return "f:/jsps/order/desc.jsp";

  }
  public String myOrders(HttpServletRequest request,HttpServletResponse response){
      HttpSession session = request.getSession();
      User user = (User) session.getAttribute("user");
      String uid = user.getUid();


      return "f:jsps/order/list.jsp";
  }
  public String load(HttpServletRequest request,HttpServletResponse response){


      return "f:jsps/order/desc.jsp";

  }
  public String confirm(HttpServletRequest request,HttpServletResponse response){

      return "f:jsps/order/msg.jsp";
  }

}
