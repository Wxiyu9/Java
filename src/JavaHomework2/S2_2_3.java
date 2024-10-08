package JavaHomework2;
import java.util.Scanner;
//输入年份和月份，输出当月天数

public class S2_2_3 {
    public static void main(String[] args)
    {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入年份：");
            int year = sc.nextInt();
            System.out.print("请输入月份：");
            int month = sc.nextInt();
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {
                System.out.println("当月共31天");
            }
            else{
                if(month == 2)
                {
                    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    {
                        System.out.println("当月共29天");
                    }
                    else{
                        System.out.println("当月共28天");
                    }
                }
                else{
                    System.out.println("当月共30天");
                }

            }
        }


    }
}
