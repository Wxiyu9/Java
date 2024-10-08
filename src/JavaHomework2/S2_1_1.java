package JavaHomework2;
import java.util.Scanner;
//输入若干个数并求和
public class S2_1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入若干个数，没输入一个回车确定\n最后输入数字0结束输入操作\n");
        double num = 0;
        double temp = sc.nextDouble();
        while(temp != 0)
        {
            num += temp;
            temp = sc.nextDouble();
        }
        System.out.println("num = " + num);
    }
}
