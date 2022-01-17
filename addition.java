package com.myfirstprogram;
import java.util.Scanner;
public class addition {

    public static void main(String[] args){

        Scanner sc=new
                Scanner(System.in);

        int number1;
        int number2;
        int Addition;


        System.out.println("Please enter number1:");
        System.out.println("number1");
        number1=sc.nextInt();
        System.out.println("please enter number2");
        System.out.println("number2");
        number2=sc.nextInt();
        Addition=number1+number2;
        System.out.println("Your Addition is ");
        System.out.println(Addition);
    }
}
