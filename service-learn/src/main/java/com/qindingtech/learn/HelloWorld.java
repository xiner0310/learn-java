package com.qindingtech.learn;

/**
 * Created by QindingTech on 2017/8/15.
 */
public class HelloWorld {
    public static void main(String[] args){
        People2 people1 = new People2();
        people1.setName("xiaofang");
        people1.setAge(18);
        people1.setSn("A8");
        People2 people2 =new People2();
        people2.setName("xiaoming");
        people2.setAge(81);
        people2.setSn("A9");

        System.out.println(people1.getName());
        System.out.println(people2.getName());
        System.out.println(people1.getAge());
        System.out.println(people2.getAge());
        System.out.println(people1.getSn());
        System.out.println(people2.getSn());
    }
}