package com.harman.project1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Addition addObj=new Addition();
        Subtraction subObj=new Subtraction();
        Multiplication mulObj=new Multiplication();
        Division divObj=new Division();
        Integer x,y,addResult,subResult,multiplyResult,divResult;
        Scanner input=new Scanner(System.in);
        System.out.println("enter num1");
        x=input.nextInt();
        System.out.println("enter num2");
        y=input.nextInt();
        addResult=addObj.Add2numbers(x,y);
        System.out.println(addResult);
        subResult=subObj.Sub2numbers(x,y);
        System.out.println(subResult);
        multiplyResult=mulObj.Multiply2numbers(x,y);
        System.out.println(multiplyResult);
        divResult=divObj.Div2numbers(x,y);
        System.out.println(divResult);
    }
}
