package com.wwang.HelloWorld;

import java.util.Scanner;

public class arry {
    public static void main(String[] args) {
        double[] grade = new double[6];
        Scanner sc = new Scanner(System.in);
        double all = 0.0;
        for(int i = 0; i < grade.length; i++)
        {
            System.out.print("请输入第" + (i + 1) + "位裁判给出的分数：");
            grade[i] = sc.nextDouble();
            all += grade[i];
        }
        double result = all / grade.length;
        System.out.println(result);
    }
}