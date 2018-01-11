package bookstore.user.dao;

import bookstore.user.domain.User;
import bookstore.util.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {

    private User user = new User();
    private QueryRunner qr = new QueryRunner();

    public User findByUsername(String username){
      String sql ="select * from tb_user where username =?";
      Connection conn = C3P0Util.getConnection();
        try {
            user=qr.query(conn,sql,new BeanHandler<User>(User.class),username);
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

    public User findByEmail(String emile){
        String sql = "select * from tb_user where username=?";
        Connection conn =C3P0Util.getConnection();
        try {
            user = qr.query(conn,sql,new BeanHandler<User>(User.class),emile);
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
    public User findByCode(String code){
        String sql = "select * from tb_user where code=?";
        Connection conn = C3P0Util.getConnection();
        try {
            user =qr.query(conn,sql,new BeanHandler<User>(User.class),code);
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
    public void add(User user){
            String sql = "insert into tb_user values(?,?,?,?,?,?)";
            Connection conn = C3P0Util.getConnection();
        System.out.println(user.getUsername());
        System.out.println(user.getUid());

        try {
            qr.update(conn,sql,user.getUid(),user.getUsername(),user.getPassword()
                    ,user.getEmail(),user.getCode(),user.getState());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateState(String uid,String state){
        if (user.getUid().equals(uid)){
            user.setState("1");
        }
    }

}
