package com.qindingtech.learn;

/**
 * Created by QindingTech on 2017/8/15.
 */
public class HelloWorld2 {
    public static void main(String[] args){
        int age[]={102,201,304,403,506,605,708,809,911};
        int age1[]={111,222,333,444,555,666,777,888,999};
        int ages[]={123,456,789,147,258,369,159,357,486};
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int index = 0;
        int j = 0;
        int e = 0;
       while(index<age.length){
           sum+=age[index];
           index++;
       }
       System.out.println(sum);
       while (j<age1.length){
           sum1+=age1[e];
           j++;
       }
       System.out.println(sum1);
       for(int f = 0;f<ages.length;f++){
           sum1=sum1 + ages[f];
       }
       System.out.println(sum1);


       for(int i = 0;i<age1.length;i++){
           sum2 = sum2 + age1[i];
       }
       System.out.println(sum2);
    }

}