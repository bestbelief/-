package com.lanou3g.study;

import java.sql.*;

public class Main5 {
    /*
    1,PreparStatement可以使用动态参数，Statement只能使用静态参数
    2，防止sql注入
    什么是sql注入？
     */
    public static void main(String[] args) {

        JdbcUtil.execute(new ExecetueInter() {
            @Override
            public Statement execute(Connection conn) {

                try {
                    PreparedStatement pstate = conn.prepareStatement(
                            "SELECT  * from  hw_user where loc=? AND  age >?;");
                    pstate.setString(1,"北京");
                    pstate.setInt(2,20);

                    ResultSet rs = pstate.executeQuery();
                    JdbcUtil.showRs(rs);

                    return pstate;  //preparedStatement是Statement的实现接口，所以可以返回
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return null;
            }
        });
//        JdbcUtil.execute(conn -> );
        String user = "zhangSan";
        String passWord = "123";

        String sql ="select * from user where username+"+user+"and passWord="+passWord;




    }
}
