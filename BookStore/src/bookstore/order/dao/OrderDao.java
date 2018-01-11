package bookstore.order.dao;

import bookstore.order.domain.Order;
import bookstore.order.domain.OrderItem;
import bookstore.util.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    QueryRunner qr = new QueryRunner();

    public void addOrder(Order order){
        String sql = "insert into orders values(?,?,?,?,?,?)";
        Connection conn = C3P0Util.getConnection();
        try {
            qr.update(conn,sql,order.getOid(),order.getOrderTime(),order.getTotal(),
                    order.getState(),order.getUid(),order.getAddress());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addOrderItemList(List<OrderItem> orderItemList){
      String sql = "insert into orderitem values(?,?,?,?,?) ";
        Connection conn = C3P0Util.getConnection();
        List<OrderItem> orderItems = new ArrayList<>();
        try {
            qr.update(conn,sql,new BeanListHandler<OrderItem>(OrderItem.class),orderItemList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Order>  findByUid(String uid){
        String sql ="select * from orders where uid = ?";
        Connection conn = C3P0Util.getConnection();
        List orders = new ArrayList();
        try {
         orders=   qr.query(conn,sql,new BeanListHandler<Order>(Order.class),uid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < orders.size(); i++) {
            
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  orders;
    }
    public void  getStateByOid(String oid){

    }
    public void updateState(String oid,int state){

    }
}
