package JavaHomework2;
import java.util.Scanner;
//输入一个两位数并逆置输出
public class S2_1_2 {
    public static void main(String[] args)
    {
        System.out.print("请输入一个两位数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("输出：");
        System.out.print(num % 10);
        System.out.print((num/10)%10);
    }
}
