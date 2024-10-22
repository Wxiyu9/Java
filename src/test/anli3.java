package test;
import java.util.Scanner;

//四位密码加密程序
public class anli3 {
    public static int Encrypt(int password)
    {
        int temp = password;
        password = 0;
        password += ((temp % 10) + 5) % 10;
        password += ((((temp / 10) % 10) + 5) % 10) * 10;
        password += ((((temp / 100) % 10) + 5) % 10) * 100;
        password += ((((temp / 1000) % 10) + 5) % 10) * 1000;
        int result = 0;
        result += (password % 10) * 1000;
        password /= 10;
        result += (password % 10) * 100;
        password /= 10;
        result += (password % 10) * 10;
        result += password / 10;
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入待加密密码：");
        int password = sc.nextInt();
        int result = Encrypt(password);
        System.out.println("加密后密码为：" + result);
    }
}
