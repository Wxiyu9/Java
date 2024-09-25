package com.wwangxu.method_cases;
//方法练习：求数组最值
public class cases_demo3 {
    public static void main(String[] args){
        int arr[] = {1,2,3,34,6,56,2};
        System.out.println(arrayMax(arr));
    }
    public static int arrayMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
