package web;

import dao.UserDao;
import bean.User;
import net.sf.json.JSONArray;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

       private UserDao dao = new UserDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String[]> parameterMap = request.getParameterMap();

        User user = new User();
        HttpSession session = request.getSession();

        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(user.getUsername().equals(username)&&user.getPassword().equals(password)){

           response.sendRedirect("http://localhost:8080/index.jsp");
        }else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.html");
                  dispatcher.forward(request,response);
        }
        session.setAttribute("username",username);
        Cookie[] cookies = request.getCookies();
        Cookie cookie = new Cookie("user", "username");
        cookie.setMaxAge(60*60*24);


        List<User> users;
                        users= dao.show();
        JSONArray jsonArray = JSONArray.fromObject(users);//获得json对象
        response.getWriter().write(jsonArray.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
