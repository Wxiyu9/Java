package com.wwangxu.test;
import java.util.Scanner;

public class anli2 {
    public static void main(String[] args){
        System.out.print("请输入评委人数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = num(n);
        System.out.println("这位选手的分数为：" + result);
    }
    public static double num(int n){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.printf("请输入第" + (i + 1)+ "个评委的打分：");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int a = 0;
        for(int i = 1; i < n - 1; i++)
        {
            a += arr[i];
        }
        double result = a / (n - 2);
        return result;
    }
}
