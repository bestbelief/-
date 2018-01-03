package dao;

import domain.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class BookDao {
    private QueryRunner qr = new QueryRunner();

    public Book selectBybname(Book bname){
        String sql = "select * from book where bname=?";
        Connection conn = JdbcUtil.getConnection();
        Book book = new Book();

        try {
            book = qr.query(conn,sql,new BeanHandler<Book>(Book.class),bname);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  book;
    }


}
