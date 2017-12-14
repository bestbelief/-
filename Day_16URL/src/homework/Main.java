package homework;

import homework.register.UserNamecheck;
import homework.register.Xml;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static public String userName;
    static public String passWord;
    static public String nickName;
    final  static int REGISTE = 1;
    final   static int LOGIN = 2;

    public static String getNickName() {
        return nickName;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getPassWord() {
        return passWord;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择 1 注册  2登录");
        int choice = input.nextInt();
        switch (choice) {
            case REGISTE:
            System.out.println("请输入你的用户名");
            String username = input.nextLine();
            userName = username;
            System.out.println("请输入你的密码");
            String password = input.nextLine();
            passWord = password;
            System.out.println("请输入你的昵称");
            String name = input.nextLine();
            nickName = name;
            break;
            case LOGIN:

        }
        Xml.xml(userName, passWord, nickName);
        UserNamecheck.check();
    }
}
