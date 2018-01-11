package bookstore.book.dao;

import bookstore.book.domain.Book;

import bookstore.util.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private QueryRunner qr = new QueryRunner();
    private Book book = new Book();
    public List<Book> findAll(){
        String sql = "select * from book";
        Connection conn = C3P0Util.getConnection();
        List books = new ArrayList();
        try {
          books=  qr.query(conn,sql,new BeanListHandler<Book>(Book.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
    public List<Book> findByCategory(String cid){
        String sql = "select * from book where cid =?";
        Connection conn = C3P0Util.getConnection();
        List books = new ArrayList();
        try {
            books=qr.query(conn, sql, new BeanListHandler<Book>(Book.class),cid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
          return books;
    }
    public Book findBybid(String bid){
        String sql="select * from book where bid=?";
        Connection conn = C3P0Util.getConnection();

        try {
          book=  qr.query(conn,sql,new BeanHandler<Book>(Book.class),bid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }
}
