package dao;

import domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Dao {

           private QueryRunner qr = new QueryRunner();
           private int count =0;
           public void   register(User user){
               String sql ="insert into user values(null,?,?,?,?,?)";
               Connection conn = null;

               conn = JdbcUtil.getConnection();

               try {
                   qr.update(conn,sql,user);
               } catch (SQLException e) {
                   e.printStackTrace();
               }
               JdbcUtil.close(conn);

           }


           public List<User> show(){
               String sql = "select * from user";
               Connection conn = null;
               conn = JdbcUtil.getConnection();

               try {
                   List<User> users = qr.query(conn, sql, new BeanListHandler<User>(User.class));

                   return users;
               } catch (SQLException e) {
                   e.printStackTrace();
               }finally {
                   JdbcUtil.close(conn);
               }
                 return null;
           }
}
