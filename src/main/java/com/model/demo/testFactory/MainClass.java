package com.model.demo.testFactory;

import java.util.Scanner;

/**
 * @author Rison_Lee on 2020/7/27 16:05.
 * @version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        //1、控制台输入
        System.out.println("----- 计算器程序------");
        System.out.println("输入第一个操作数:");
        Scanner scanner = new Scanner(System.in);
        String stringNum1 = scanner.nextLine();
        System.out.println("输入运算符：");
        String oper = scanner.nextLine();
        System.out.println("输入第二个操作数");
        String stringNum2 = scanner.nextLine();
        double result = 0;
        //2、进行运算
        if ("+".equals(oper)){
            result = Double.parseDouble(stringNum1) + Double.parseDouble(stringNum2);
        }else if ("-".equals(oper)){
            result = Double.parseDouble(stringNum1) - Double.parseDouble(stringNum2);
        }else if ("*".equals(oper)){
            result = Double.parseDouble(stringNum1) * Double.parseDouble(stringNum2);
        }
        else if ("/".equals(oper)){
            result = Double.parseDouble(stringNum1) / Double.parseDouble(stringNum2);
        }else {
            System.out.println("未知运算符！");
        }
        //3、返回结果
        System.out.println(stringNum1 + oper + stringNum2 + "=" + result);
    }
}
