package homework.dao;

import homework.domain.User;
import homework.util.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {
         QueryRunner qr = new QueryRunner();
           public void add(User user){
             String sql = "insert into user values(?,?,?,?)";
             Connection conn = C3P0Util.getConnection();
             try {
                 qr.update(conn,sql,user.getUsername(),user.getPassword(),user.getPhone(),user.getEmail());
             } catch (SQLException e) {
                 e.printStackTrace();
             }
               try {
                   conn.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }
         public User query(String username){
             String sql = "select * from user where username=?";
             Connection conn = C3P0Util.getConnection();
             User user = new User();
             try {
               user=  qr.query(conn,sql,new BeanHandler<User>(User.class),username);
             } catch (SQLException e) {
                 e.printStackTrace();
             }
             try {
                 conn.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
             return user;
         }
}
