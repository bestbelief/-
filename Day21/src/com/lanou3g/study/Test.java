package com.lanou3g.study;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
    //静态的东西会随着类的加载而进入内存
//        所以当我们未创建对象，只是将类加载时
//                会执行该类的静态代码块
//                而因类只会加载一次，所以创建对象时，是不会再执行静态代码块
//        Class c = T.class; //类对象

        //静态代
//         Class<?> aClass = Class.forName("com.lanou3g.study.T");

         T  t = new T();
    }


}
