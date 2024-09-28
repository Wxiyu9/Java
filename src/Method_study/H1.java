package Method_study;

//计算飞机票优惠程序
import java.util.Scanner;

public class H1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        if(month > 12 || month < 1)
        {
            System.out.println("非法月份，无法计算");
            return;
        }
        System.out.println("请选择舱位类型：0.经济舱  1.头等舱");
        int ticketType = sc.nextInt();
        if(ticketType != 1 && ticketType != 0)
            System.out.println("非法舱位类型，无法计算");
        else
            Discount(month,ticketType);
    }
    public static void Discount(int month,int ticketType)
    {
        //ticketType == 1 头等舱
        //ticketType == 0 经济舱
        if(month >= 5 && month <= 10)//旺季
        {
            if(ticketType == 1)
                System.out.println("打9折");
            else
                System.out.println("打8.5折");
        }
        else
        {
            if(ticketType == 1)
                System.out.println("打7折");
            else
                System.out.println("打6.5折");
        }
    }
}
