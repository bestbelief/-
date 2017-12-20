package com.lanou3g.study;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main4 {

    public static void main(String[] args) {
        //调用JdbcUtil类时，该类会加载进内存
        //也就是会执行静态代码块，获得配置文件中的数据

        //执行静态方法execute，传入的是ExecuteInter接口的一个匿名实现类对象
        //这里和我们学习的线程时很类似

        //传入的对象，我们先交它e
        //在execute方法中（可以点进去看一下）
        //第一步：根据配置文件中的数据建立连接
        //第二部：调用e的execute方法，将连接传入
        //这里就会回来执行这个匿名实现类的execute
        //在这个方法中我们获得state,执行sql语句
        //并且，将state作为返回值返回
        //第三步：将e.execute()得到的返回值关闭
        //第四步：关闭连接
        JdbcUtil.execute(new ExecetueInter() {
            @Override
            public Statement execute(Connection conn) {
                try {
                    Statement state = conn.createStatement();
                    String sql = "select * from hw_user";
                    ResultSet rs = state.executeQuery(sql);
                    //接下来是遍历rs
                    while (rs.next()){
                        System.out.print(rs.getString(1)+"\n");
                        System.out.print(rs.getString(2)+"\n");
                        System.out.print(rs.getString(3)+"\n");
                        System.out.print(rs.getString(4)+"\n");
                        System.out.println();
                    }
                    return state;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
             return  null;
            }
        });
    }

}
