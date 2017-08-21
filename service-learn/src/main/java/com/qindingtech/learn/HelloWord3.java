package com.qindingtech.learn;

import java.awt.*;

/**
 * Created by QindingTech on 2017/8/21.
 */
public class HelloWord3 {
    public void peopleInfo() {
        final String sex = "man";
        class Student {
            String ID = "20151234";

            public void print() {
                System.out.println("访问外部类的方法中的sex:" + sex);
                System.out.println("访问内部中的变量ID:" + ID);
            }
        }
        People2 a = new People2();
        a.print();
    }

    public void peopleInfo2(boolean b) {
        if (b) {
            final String sex = "man";
            class Student {
                String ID = "20151234";

                public void print() {
                    System.out.println("访问外部类的方法中的sex:" + sex);
                    System.out.println("访问内部中的变量ID:" + ID);
                    People2 a = new People2();
                }
            }
        }
    }

    public static void main(String[] args) {
        People b = new People();
        System.out.println("定义在方法内：=========");
//        b.peopleINfo();
        System.out.println("定义在作用域内：==============");
//        b.peopleInfo2(true);
    }
}


class People {
    private String name = "lilei";
    static String ID = "510xxx199X0724XXXX";

    public static class student {
        String ID;

        {
            ID = "20151234";
        }

        protected student() {
            System.out.println("访问外部类中的name：" + (new People().name));
            System.out.println("访问外部类中的ID：" + People.ID);
            System.out.println("访问内部类中的ID：" + ID);
        }

        void stuInfo() {
        }
    }
}