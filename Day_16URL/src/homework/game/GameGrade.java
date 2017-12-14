package homework.game;

import java.util.Random;
import java.util.Scanner;

public class GameGrade {

    public static void main(String[] args) throws InterruptedException {
             GameGrade.difficulty();

        }
        public static void difficulty() throws InterruptedException {
            Random rand = new Random();
//        int number =rand.nextInt(100);
//        System.out.println(number);
            String[] str = {"~", "!", "@", "#", "$", "^", "&", "*"};
            for (int i = 0; i < 15; i++) {
                //          Random  rand =new Random();
                int number = rand.nextInt(100);
                //System.out.println(number);
                int rande = (int) (Math.random() * 8);
                char ch = (char) (int) (Math.random() * 26 + 'A');
                Thread.sleep(500);
                System.out.print(str[rande]);
                Thread.sleep(500);
                System.out.print(number);
                Thread.sleep(500);
                System.out.println(ch);
                Scanner input = new Scanner(System.in);
                String st = input.nextLine();

                if(st.equals(rande+""+number+""+ch+"")){
                    System.out.println("恭喜你，闯关成功！");
                }else {
                    System.out.println("闯关失败，欢迎再战！");
                }
            }
        }
                  public static void moderate() throws InterruptedException {
                      Random random =new Random();
                      for (int i = 0; i <15 ; i++) {
                          int number = random.nextInt(50);
                          char ch = (char)(int)(Math.random()*26+'a');
                          Thread.sleep(500);
                          System.out.println(ch);
                          Thread.sleep(500);
                          System.out.println(number);
                          Scanner input = new Scanner(System.in);
                          String st =input.nextLine();
                          if(st.equals(ch+""+number)){
                              System.out.println("恭喜你，闯关成功!");
                          }else {
                              System.out.println("闯关失败，欢迎再战！");
                          }
                      }


    }
                 public static void simple() throws InterruptedException {
                  Random random = new Random();
                     for (int i = 0; i <15 ; i++) {
                         int  number = random.nextInt(10);
                         char ch =(char)(int)(Math.random()*26+'a');
                         Thread.sleep(500);
                         System.out.println(number);
                         Thread.sleep(500);
                         System.out.println(ch);
                         Scanner input = new Scanner(System.in);
                         String st = input.nextLine();
                         System.out.println(number+ch+"");
                         System.out.println(st);
                         if((number+""+ch).equals(st)){
                             System.out.println("恭喜你，闯关成功!");
                         }else {
                             System.out.println("闯关失败，欢迎再战！");
                         }
                     }


                 }
        }






