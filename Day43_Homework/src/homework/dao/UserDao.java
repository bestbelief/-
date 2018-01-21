package homework.dao;

import homework.domain.User;
import homework.util.HibernateUtil;

public class UserDao {

    public void save(User user){
        HibernateUtil.handle(session -> {
            session.save(user);
            return null;
        });
    }
    public User query(User user){

        User user2 = HibernateUtil.handle(session -> {
            User user1 = session.get(User.class, user.getUid());

            return user1;
        });

          return user2;

    }


}
