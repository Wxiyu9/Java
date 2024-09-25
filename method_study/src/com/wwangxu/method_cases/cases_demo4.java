package com.wwangxu.method_cases;
//方法练习：在数组中检索数据
public class cases_demo4 {
    public static void main(String[] args){
        int arr[] = {11,45,347,56,23,512,2,7,3};
        System.out.println(searchNum(arr,3));
    }
    public static int searchNum(int[] arr, int num){
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == num)
                return i;
        }
        return -1;
    }

}
