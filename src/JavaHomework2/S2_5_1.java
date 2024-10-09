package JavaHomework2;
import java.util.Scanner;

public class S2_5_1 {
    public static int SearchElement(int arr[],int num){
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == num)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查找的数字：");
        int num = sc.nextInt();
        int result = 0;
        if((result = SearchElement(arr,num)) == -1)
        {
            System.out.println("该元素不存在");
        }
        else
        {
            System.out.println("该元素下标为：" + result);
        }
    }
}
