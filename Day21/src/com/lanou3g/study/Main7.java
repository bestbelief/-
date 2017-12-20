package com.lanou3g.study;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main7 {
    public static void main(String[] args) {
        /*
        事务的四个特性（ACID):
        原子性   一致性   隔离性  持久性
         */
        JdbcUtil.execute(conn -> {
            //设置为false,表示手动提交，也就是开启事务
            //默认是自动提交
            PreparedStatement pstate = null;
            try {
                conn.setAutoCommit(false);

                pstate = conn.prepareStatement("delete from hw_user where uname =?");

                pstate.setString(1,"张三");
                pstate.execute();

              Class.forName("");

                pstate.setString(1,"lisi");
                pstate.execute();

                conn.commit();
//                return pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                //取消操作，回滚
                try {
                    conn.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            return pstate;
        });
    }
}
