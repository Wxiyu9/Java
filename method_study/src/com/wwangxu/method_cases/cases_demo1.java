package com.wwangxu.method_cases;
//方法练习：打印数组
public class cases_demo1 {
    public static void main(String[] args){
        int[] arr = {1,2,345,25,1,654,2,4,5,6};
        Array(arr);
    }
    public static void Array(int[] arr){
        System.out.print("[");
        int i = 0;
        for(i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[i] + "]");
    }
}
