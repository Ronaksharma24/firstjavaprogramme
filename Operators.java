package com.myfirstprogram;
import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner sc=new
                Scanner(System.in);
        int olevel;
        int gcse;
        int math;
        int science;
       System.out.println("please enter olevel percentage");
        System.out.println("olevel");
        olevel= sc.nextInt();
        System.out.println("please enter gcse percentage");
        gcse=sc.nextInt();
        System.out.println("please enter math mark");
        math=sc.nextInt();
        System.out.println("please enter science mark");
        science=sc.nextInt();



        if (olevel >= 75 || gcse >= 75) {
            System.out.println("Your eligible for course");

        }else
        {
            System.out.println("Your are not eligible for course ");
        }
        if (math>90 && science>90){
            System.out.println("your eligible for scholarship");
        }
        else {
            System.out.println("Your not eligible for course");

        }
    }
}