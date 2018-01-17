package homework;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class C3p0Util {
    //得到一个连接池（数据源）
    private static DataSource dataSource = new ComboPooledDataSource();

    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("服务器繁忙");

        }
    }
    public static void release(ResultSet rs, Statement stt, Connection conn){
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs =null;
        }
            if(stt != null){
                try {
                    stt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stt = null;
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn =null;
            }
        }


}

