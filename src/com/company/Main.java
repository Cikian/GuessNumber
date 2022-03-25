package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r=new Random();
        int x=r.nextInt(100)+1;
        int i=0;
      //  System.out.println(x);
        Scanner input=new Scanner(System.in);
        System.out.println("请输入1-100的整数：");
        for ( ; ; ){
            int getNum=input.nextInt();
            i++;
            if (getNum>100|getNum<1){
                System.out.println("输入有误，请重新输入：");
            }else {
                if (getNum<x){
                    System.out.println("小了,请重新输入:");
                }else if(getNum>x){
                    System.out.println("大了,请重新输入:");
                }else if(getNum==x){
                    break;
                }
            }
        }
        System.out.println("恭喜,输入正确！");
        System.out.println("你一共输入了"+i+"次。");
    }
}
