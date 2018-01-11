package bookstore.cart.web.servlet;
import bookstore.book.dao.BookDao;
import bookstore.book.domain.Book;
import bookstore.cart.domain.Cart;
import bookstore.cart.domain.CartItem;
import bookstore.util.BaseServlet;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "CartServlet",urlPatterns = "/cart")
public class CartServlet extends BaseServlet{
     private BookDao bookDao = new BookDao();


    public String add(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        Map<String, CartItem> map1 = null;
        if (cart == null){
            cart = new Cart();
            map1 = new HashMap<>();
        }else {
            map1= cart.getMap();
        }
        String bid = request.getParameter("bid");
        String count = request.getParameter("count");
        Book book = bookDao.findBybid(bid);
        System.out.println(book);
        CartItem cartItem =new CartItem(book,count);
        System.out.println(cartItem);
        map1.put(bid, cartItem);
        cart.setMap(map1);
        session.setAttribute("cart", cart);
        return "f:/jsps/cart/list.jsp";
    }
    public String clear(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        session.removeAttribute("cart");
        return "f:jsps/cart/list.jsp";

    }
    public String delete(HttpServletRequest request,HttpServletResponse response){
        String bid = request.getParameter("bid");
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        Map<String,CartItem> map =  cart.getMap();
        map.remove(bid);
        return "f:jsps/carts/list.jsp";
    }
    }

