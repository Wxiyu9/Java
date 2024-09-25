package com.wwangxu.define;
//方法练习：定义方法
public class demo1 {
    public static void main(String[] args){
        int a = 19;
        int b = 23;
        int c = Nujm(a,b);
        System.out.println(c);
    }
    public static int Nujm(int a,int b){
        int c = a + b;
        return c;
    }
}
