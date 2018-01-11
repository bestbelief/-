package bookstore.user.web.servlet;


import bookstore.cart.domain.Cart;
import bookstore.user.dao.UserDao;
import bookstore.user.domain.User;
import bookstore.user.service.UserService;
import bookstore.user.service.exception.LoginException;
import bookstore.user.service.exception.RegistException;
import bookstore.util.BaseServlet;
import bookstore.util.SendEmail;
import org.apache.commons.beanutils.BeanUtils;

import javax.mail.MessagingException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

@WebServlet(name="UserServlet",urlPatterns = "/user")
public class UserServlet extends BaseServlet {
       private UserDao userDao = new UserDao();
       private User user = new User();
       private UserService userService = new UserService();
       private SendEmail sendEmail = new SendEmail();
       private Cart cart  = new Cart();
    public String regist(HttpServletRequest request, HttpServletResponse response){
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(user,parameterMap);
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            user.setUid(uuid);
            user.setCode(uuid+uuid);
            user.setState("0");

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        try {
            userService.regist(user);
        } catch (RegistException e) {
            request.setAttribute("user",user);
            return "f:/regist.jsp";
        }
        try {
            sendEmail.t1();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        request.setAttribute("user",user);
        System.out.println(user);
        userDao.add(user);

        return "f:/jsps/user/login.jsp";
    }
    public String active(HttpServletRequest request,HttpServletResponse response){
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        try {
            userService.active(user.getCode());
        } catch (RegistException e) {
           request.setAttribute("user",user);
           return "f:/login.jsp";
        }
        request.setAttribute("user",user);

        return "f:/msg.jsp";
    }

    public String login(HttpServletRequest request,HttpServletResponse response){
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        try {
            userService.login(user);
        } catch (LoginException e) {
            request.setAttribute("user",user);
            return "f:/jsps/user/regist.jsp";
        }
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        session.setAttribute("cart",cart);
        return "f:/jsps/main.jsp";
    }
    public String quit(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "f:/jsps/user/login.jsp";
    }



}
