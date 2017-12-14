package homework.game;

import java.util.Scanner;

public class WeGame {
    final static int DIFFICULTY =1;
    final static int MODERATE =2;
    final static int SIMPLE =3;
    public static void main() throws InterruptedException {


        Scanner input =new Scanner(System.in);
        System.out.println("请选择游戏等级：1困难 2适中 3简单");
       int   choice =input.nextInt();
        System.out.println("游戏还有3秒即将开始");
       Thread.sleep(1000);
        System.out.println("游戏还有2秒即将开始");
        Thread.sleep(1000);
        System.out.println("游戏还有1秒即将开始");
        Thread.sleep(1000);
        System.out.println("游戏即将开始");
        Long startMili = System.currentTimeMillis();
        System.out.println("开始时间："+startMili);
        switch (choice){
            case DIFFICULTY:
                GameGrade.difficulty();
                break;
            case MODERATE:
                GameGrade.moderate();
                break;
            case SIMPLE:
                GameGrade.simple();
                break;
        }
        long endMili =System.currentTimeMillis();
        System.out.println("结束时间"+endMili);
        System.out.println("游戏时间:"+(endMili-startMili)+"毫秒");

    }
}
