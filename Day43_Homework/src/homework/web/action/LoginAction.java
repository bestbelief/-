package homework.web.action;

import com.opensymphony.xwork2.ActionSupport;
import homework.dao.EmployeeDao;
import homework.dao.UserDao;
import homework.domain.User;
import homework.service.LoginService;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginAction extends ActionSupport {
    private User user ;
    LoginService loginService = new LoginService();
    private UserDao userDao = new UserDao();


    public String login(){
        if (user != null) {

            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("user",user);
            String s = loginService.login(user);
            System.out.println(s);
        }
        return "success";
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
