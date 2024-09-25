package com.wwangxu.practice;
//生成指定位数的验证码（包含数字、大小写字母）
import java.util.Random;
import java.util.Scanner;

public class H2 {
    public static void main(String[] args){
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入验证码长度：");
        n = sc.nextInt();
        String Captacha = createCaptcha(n);
        System.out.println("已生成：" + Captacha);
    }
    public static String createCaptcha(int n){
        String Cap = "";
        Random r = new Random();
        for(int i = 0; i < n; i++)
        {
            int a = r.nextInt(62) + 48;//48-110
            if(a >= 58 && a <= 83)
                a += 7;
            else if(a > 83)
                a += 13;
            Cap += (char)a;
        }
        return Cap;
    }
}
