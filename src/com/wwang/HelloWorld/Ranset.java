package com.wwang.HelloWorld;

import java.util.Random;
import java.util.Scanner;

public class Ranset {
    public static void main(String[] args)
    {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i = 0; i < num.length; i++)
        {
            System.out.print("请输入第" + (i + 1) + "位员工的工号：");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < num.length; i++)
        {
            int pointer = rd.nextInt(num.length);
            int temp = num[i];
            num[i] = num[pointer];
            num[pointer] = temp;
        }
        System.out.print("随机排序的结果为：");
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
}
