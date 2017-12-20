package homework;

import com.mysql.jdbc.Driver;


import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day21","root","123");
        String sql = "select * from userdata";
        Statement state = conn.createStatement();
        ResultSet result = state.executeQuery(sql);
        while (result.next()){
            System.out.print(result.getString(1)+"\t");
            System.out.print(result.getString(2)+"\t");
            System.out.print(result.getString(3)+"\t");
            System.out.print(result.getString(4)+"\t");
            System.out.print(result.getString(5)+"\t");
            System.out.println();
        }

        result.close();
        state.close();
        conn.close();
    }
}
