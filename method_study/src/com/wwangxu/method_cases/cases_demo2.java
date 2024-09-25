package com.wwangxu.method_cases;
//方法练习：比较数组
public class cases_demo2 {
    public static void main(String[] args){
        int arr1[] = {0,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        System.out.println(judgment(arr1,arr2));
    }
    public static boolean judgment(int[] arr1,int[] arr2){
        if(arr1.length != arr2.length)
            return false;
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
