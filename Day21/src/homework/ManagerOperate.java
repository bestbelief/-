package homework;

import java.sql.PreparedStatement;

public class ManagerOperate {

    public static void  select(){
           Jdbc.getConnection();
           String sql ="select * from userdata";
    }
    public static void insert(){
        Jdbc.getConnection();
//        PreparedStatement pstate = conn.P
//        String sql= "insert into userdate where values(6,'zhaoQi',666666,'赵琦','superman');
//    }
}
