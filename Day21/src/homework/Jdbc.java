package homework;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Jdbc {
      static{
          Properties prop = new Properties();
          try {
              prop.load(new FileReader("src/homework/jdbc.properties"));
              String driverName = prop.getProperty("driverName");
              url = prop.getProperty("url");
              user = prop.getProperty("user");
              password = prop.getProperty("password");
              database = prop.getProperty("database");
              Class.forName(driverName);
          } catch (IOException e) {
              System.out.println(e.getMessage()+"\n\t\t"+"请将配置文件放在jdbc.properties放置在homework目录下");
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
            Connection connection = DriverManager.getConnection(url + database, user, password);

            return  connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
