package homework;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Jdbc {
    static {
        try {
            Properties prop = new Properties();
            prop.load(new FileReader("src/Properties"));
            String driverName = prop.getProperty("driverName");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
            database = prop.getProperty("database");
            Class.forName(driverName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
       private static String url;
       private static String user;
       private static String password;
       private static String database;

       public static Connection getConnection(){
           try {
               Connection conn = DriverManager.getConnection(url + database, user, password);

               return conn;
           } catch (SQLException e) {
               e.printStackTrace();
           }
           return null;
       }

}