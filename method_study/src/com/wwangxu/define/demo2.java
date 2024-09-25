package com.wwangxu.define;
//方法练习：累加方法
public class demo2 {
    public static void main(String[] args) {
        System.out.println(Num(5));
    }
    public static int Num(int n){
        int result = 0;
        for(int i = 1; i <= n; i++)
        {
            result += i;
        }
        return result;
    }
}
