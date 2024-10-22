package test;
import java.util.Scanner;
import java.util.Random;

//模拟抢红包
public class anli5 {
    public static void main(String[] args) {
        int money[] = {9,666,188,520,99999};
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int count = 0;
        int num = 0;
        while(count != money.length)
        {
            System.out.print("请按任意键完成抽奖：");
            String aa = sc.next();
            while(true)
            {
                num = r.nextInt(money.length);
                if(money[num] != 0)
                    break;
            }
            System.out.println("恭喜您，您抽中了" + money[num]);
            money[num] = 0;
            count++;
        }
        System.out.println("活动结束。。。");
    }
}
