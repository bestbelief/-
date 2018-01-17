package homework;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class UserAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
    private UserDao userDao = new UserDao();
    private HttpServletRequest request;
    private HttpServletResponse response;
    public String register(){
        Map<String, String[]> parameterMap = request.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if (user != null){
            userDao.add(user);
            return "login";
        }
        return "register";
    }

    public String login(){
        Map<String, String[]> parameterMap = request.getParameterMap();
        User user = new User();

        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if (user.getUsername().equals(userDao.query(user.getUsername()))){
            if (user.getPassword().equals(userDao.query(user.getPassword()))){
               return "index";
            }

        }
        return "login";
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
                    this.request=httpServletRequest;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
            this.response = httpServletResponse;
    }
}
