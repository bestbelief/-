package web;

import dao.UserDao;
import domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
       private UserDao userDao = new UserDao();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        Map<String,String[]> parameterMap = request.getParameterMap();

        User user = new User();

        try {
            BeanUtils.populate(user,parameterMap);

            User u = userDao.queryByUsername(user.getUsername());
            HttpSession session = request.getSession();
            if(user.getUsername().equals(u.getUsername())){
                if(user.getPassword().equals(u.getPassword())){
                   session.setAttribute("username",user.getUsername());
                   request.setAttribute("username",user.getUsername());
                   response.sendRedirect("/day30/index.jsp");
                }
            }else {
                System.out.println("登录失败，请重新登录");
            }




        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
