package com.wwangxu.practice;
//计算评委打分分数
import java.util.Scanner;
public class H3 {
    public static void main(String[] args){
        double result = gradesNum();
        System.out.println(result);
    }
    public static double gradesNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入评委人数");
        int n = sc.nextInt();
        int[] grades = new int[n];
        for(int i = 1; i <= n; i++)
        {
            System.out.print("请输入第" + i + "位评委的打分：");
            grades[i - 1] = sc.nextInt();
        }
        int max = 0;
        int min = 100;
        int all = 0;
        for(int i = 0; i < n; i++)
        {
            if(max < grades[i])
                max = grades[i];
            if(min > grades[i])
                min = grades[i];
            all += grades[i];
        }
        all = all - max - min;
        double result = all / (n - 2);
        return result;
    }
}
