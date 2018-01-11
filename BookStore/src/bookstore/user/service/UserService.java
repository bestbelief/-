package bookstore.user.service;


import bookstore.user.dao.UserDao;
import bookstore.user.domain.User;
import bookstore.user.service.exception.*;
import bookstore.user.web.servlet.UserServlet;

public class UserService {
    private UserDao userDao = new UserDao();
    public void regist(User user) throws RegistException {
        User DbName = userDao.findByUsername(user.getUsername());
        if (DbName != null) {
            throw new UserExistException();
        }
        User DbEmail = userDao.findByEmail(user.getEmail());
        if (DbEmail != null){
            throw new EmialExistException();
        }
    }
    public void active(String code) throws RegistException{
        User DbUser = userDao.findByCode(code);

        if (DbUser ==null){
            throw new CodeErrorException();
        }
        if (DbUser.getState()== "1"){
            throw new ActivatedException();
        }else {
         userDao.updateState(DbUser.getUid(),DbUser.getState());
        }

    }
    public User login(User user) throws LoginException {
        User DbUser = userDao.findByUsername(user.getUsername());
        if (DbUser == null) {
            throw new UserNotExistException();
        }
            if (user.getPassword().equals(DbUser.getPassword())) {

            } else {
                throw new PasswordNotMatchException();
            }
            if(user.getState()=="0"){
               throw new StateFalseException();
            }

            return user;
        }



}
