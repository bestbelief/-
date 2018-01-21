package homework.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import homework.dao.UserDao;
import homework.domain.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class LoginInterceptor extends AbstractInterceptor{
//    @Override
//    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
//        HttpSession session = ServletActionContext.getRequest().getSession();
//       User user = (User) session.getAttribute("user");
//        System.out.println("拦截器，哈哈哈");
//        if(user == null) {
//            return "error";
//        }
//        System.out.println("通过啦");
//        return actionInvocation.invoke();
//    }
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
       User user = (User) session.getAttribute("user");
        System.out.println("拦截器，哈哈哈");
        if(user == null) {
            return "error";
        }
        return actionInvocation.invoke();
    }
//      private UserDao userDao = new UserDao();
//
//    @Override
//    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
//        HttpSession session = ServletActionContext.getRequest().getSession();
//       User user = (User) session.getAttribute("user");
//        User user1 = userDao.query(user);
//        System.out.println(user+"------");
//
//        if(user != null){
////           if (user.getUsername().equals(user1.getUsername())
////                   &&user.getPassword().equals(user1.getPassword())){
//            String invoke = actionInvocation.invoke();
//            System.out.println("我是invoke"+invoke);
//            return actionInvocation.invoke();
//
////           }
//
//       }
//        System.out.println(user+"我是拦截器");
//        return "login";
//    }
}
