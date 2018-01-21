package homework.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory SF;
    static {
       SF = new Configuration().configure().buildSessionFactory();
    }
    public interface ResultHandler<T>{
        T resultHandler(Session session);
    }

    public static <T> T handle(ResultHandler<T> resultHandler){
        Session session = SF.openSession();
        Transaction transaction = session.beginTransaction();

        T t = resultHandler.resultHandler(session);
          transaction.commit();
          session.close();

        return t;
    }
}
