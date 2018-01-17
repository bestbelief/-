package homework.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhuang.util.VerifyCode;
import homework.domain.User;
import homework.dao.UserDao;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class UserAction extends ActionSupport implements ModelDriven<User>,
        ServletRequestAware,ServletResponseAware{
    private User user = new User();
    private UserDao userDao = new UserDao();
    private HttpServletRequest request;
    private HttpServletResponse response;

    public String register() throws IOException {



        String output = VerifyCode.getInstance().output(ServletActionContext.getResponse().getOutputStream());

        if (user != null){

            userDao.add(user);
            return "login";
        }
        return "register";
    }

    public String login(){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"-----");
        User user = userDao.query(username);
        System.out.println(user +"---user---");
        if (username.equals(user.getUsername()) && password.equals(user.getPassword())){

            return "index";
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

    @Override
    public User getModel() {
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void validateRegister(){
        if (StringUtils.isBlank(user.getUsername())){
            addFieldError("username","username不能为空");
        }
        if(StringUtils.isBlank(user.getPassword())){
            addFieldError("password","password不能为空");
        }
        if(StringUtils.isBlank(user.getConfirmPassword())){
            addFieldError("confirmPassword","密码错误");
        }
        if (StringUtils.isBlank(user.getPhone())){
            addFieldError("phone","phone不能为空");
        }
        if (StringUtils.isBlank(user.getEmail())){
            addFieldError("email","email不能为空");
        }
        if(StringUtils.isBlank(user.getVerify())){
            addFieldError("verify","验证码错误");
        }

    }
}
