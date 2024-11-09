package com.june.interview;

class AA {

    public void method1(){

        System.out.println("AA class Method");
    }



}
public class BB  extends AA{

    public void method1(){

        System.out.println("BB class Method");
    }

    public static void main(String[] args) {

        AA a = new AA();
        a.method1();
    }


}
