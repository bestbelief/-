package homework;

import homework.game.WeGame;
import homework.register.UserNamecheck;
import homework.register.Xml;
import homework.weather.SearchDemo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static public String userName;
    static public String passWord;
    static public String nickName;
    public static String score;
    final static int REGISTE = 1;
    final static int LOGIN = 2;
    final static int WEATHER = 1;
    final static int PHONE = 2;
    final static int GAME = 3;
    final static int TOPTEN = 4;

    public static String getNickName() {
        return nickName;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getPassWord() {
        return passWord;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择 1 注册  2登录");
        int choice = input.nextInt();
        input.nextLine();
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
                System.out.println("请输入你的用户名");
                String us = input.nextLine();
                System.out.println("请输入你的密码");
                String ps = input.nextLine();
                System.out.println("请输入你的昵称");
                String na = input.nextLine();

        }
        System.out.println("恭喜你，登录成功");
        System.out.println("1 查询天气");
        System.out.println("2 查询手机归属地");
        System.out.println("3 手速游戏");
        System.out.println("4 查询手速游戏前十用户");

        int select = input.nextInt();
        switch (select) {
            case WEATHER:
                SearchDemo.searchcity();
                break;
            case PHONE:
                SearchDemo.searchPhone();
                break;
            case GAME:
               WeGame.main();
                break;
            case TOPTEN:
                break;


        }
        Xml.xml(userName, passWord, nickName);
        UserNamecheck.check();
    }
}
