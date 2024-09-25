package com.wwangxu.practice;
//加密四位数字
import java.util.Scanner;
public class H4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入待加密数字：");
        int num = sc.nextInt();
        System.out.println("已加密：" + Encrypt(num));
    }
    public static int Encrypt(int num){
        int ge = num % 10;
        int shi = (num / 10) % 10;
        int bai = (num / 100) % 10;
        int qian = (num / 1000) % 10;
        ge = (ge + 5) % 10;
        shi = (shi + 5) % 10;
        bai = (bai + 5) % 10;
        qian = (qian + 5) % 10;
        int result = ge + shi * 10 + bai * 100 + qian * 1000;
        return result;
    }
}
