package homework.service;

import homework.dao.UserDao;
import homework.domain.User;

public class LoginService {
    private     UserDao userDao = new UserDao();

    public String login(User user){
        user.setUid(1);
        User user1 = userDao.query(user);

        if (user != null){
            if (user.getUsername().equals(user1.getUsername())
                    &&user.getPassword().equals(user1.getPassword())){
                return "success";
            }
            System.out.println(user1+"我是user1");
        }
        return "login";
    }



}
