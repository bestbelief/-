package bookstore.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {
           private static String user;
           private static String password;
           private static String database;
           private static String url;
           private static String driverClass;

           static {
               try {
                   ClassLoader cl = JdbcUtil.class.getClassLoader();  //类加载器，能帮我们加载一些配置文件
                   InputStream inputStream = cl.getResourceAsStream("jdbc.properties");

                   Properties  info = new Properties(); //用来读取配置文件
                   try {
                       info.load(inputStream);
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                   user= info.getProperty("user");
                   password= info.getProperty("password");
                   database=info.getProperty("database");
                   url=info.getProperty("url");

                   driverClass=info.getProperty("driverClass");

                  Class.forName(driverClass);
               } catch (ClassNotFoundException e) {
                   throw new RuntimeException("路径错误"); //运行时异常，希望运行时崩掉，方便检错
               }
           }

           public static Connection getConnection(){
               Connection conn =null;

               try {
                   conn = DriverManager.getConnection(url+database,user,password);
               } catch (SQLException e) {
                   e.printStackTrace();
               }
              return conn;

           }
           public static void close(Connection conn, Statement stt, ResultSet rs){
                   if(conn !=null){
                       try {
                           conn.close();
                       } catch (SQLException e) {
                           e.printStackTrace();
                       }
                   }
                   if(stt !=null){
                       try {
                           stt.close();
                       } catch (SQLException e) {
                           e.printStackTrace();
                       }
                   }
                   if(rs !=null ){
                       try {
                           rs.close();
                       } catch (SQLException e) {
                           e.printStackTrace();
                       }
                   }
           }
           public static void close(Connection conn){
               close(conn,null,null);
           }
           public static void close(Statement stt){
               close(null,stt,null);
           }
           public static void close(ResultSet rs){
               close(null,null,rs);
           }
}
