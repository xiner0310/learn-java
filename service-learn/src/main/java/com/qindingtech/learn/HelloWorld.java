package com.qindingtech.learn;

/**
 * Created by QindingTech on 2017/8/15.
 */
public class HelloWorld {
        public static void main(String args[]) {
            int a = 60;
            int b = 13;
            System.out.println("a & b = " + (a & b));
            System.out.println("a | b = " + (a | b));
            System.out.println("a ^ b = " + (a ^ b));
            System.out.println("~a = " + (~a));
            System.out.println("a << 2 = " + (a << 2));
            System.out.println("a >> 2 = " + (a >> 2));
            System.out.println("a >>> 2 = " + (a >>> 2));
        }
    }