package JavaHomework2;
import java.util.Scanner;
import java.util.Random;
//小学生加减法练习程序
public class S2_2_4 {
    public static void main(String[] args) {
        while (true) {


            Scanner sc = new Scanner(System.in);
            Random r = new Random();
            //生成加减法：1为加法 0为减法
            int num1 = r.nextInt(90) + 10;
            int num2 = r.nextInt(90) + 10;
            int result;
            int style = r.nextInt(2);
            //减法
            if (style == 0) {
                if (num1 > num2) {
                    System.out.print(num1 + "-" + num2 + "=");
                    result = sc.nextInt();
                    if (result == num1 - num2) {
                        System.out.println("运算正确");
                    } else {
                        System.out.println("运算错误");
                    }
                } else {
                    System.out.print(num2 + "-" + num1 + "=");
                    result = sc.nextInt();
                    if (result == num2 - num1) {
                        System.out.println("运算正确");
                    } else {
                        System.out.println("运算错误");
                    }
                }
            } else {
                System.out.print(num1 + "+" + num2 + "=");
                result = sc.nextInt();
                if (result == num1 + num2) {
                    System.out.println("运算正确");
                } else {
                    System.out.println("运算错误");
                }
            }
        }
    }
}
