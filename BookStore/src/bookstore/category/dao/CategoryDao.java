package bookstore.category.dao;


import bookstore.category.domain.Category;

import bookstore.util.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
    private QueryRunner qr = new QueryRunner();

    public List<Category>  findAll(){
        String sql = "select * from  category";
        Connection conn = C3P0Util.getConnection();
        List<Category> categories = new ArrayList<>();

        try {
            categories= qr.query(conn,sql,new BeanListHandler<Category>(Category.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

}
