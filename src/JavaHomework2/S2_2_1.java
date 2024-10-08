package JavaHomework2;
import java.util.Scanner;
//用户输入

public class S2_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = sc.next();
        while(name.length() < 3)
        {
            System.out.print("用户名输入有误，长度应不小于三，请重新输入：");
            name = sc.next();
        }
        System.out.println("用户名输入成功！");
        System.out.print("请输入密码：");
        String password = sc.next();
        while(password.length() < 6)
        {
            System.out.print("密码输入有误，长度应不小于六，请重新输入：");
            password = sc.next();
        }
        System.out.print("请确认密码：");
        String passwordSure = sc.next();
        while(!passwordSure.equals(password)){
            System.out.print("与首次输入不一致，请重新输入：");
            passwordSure = sc.next();
        }
        System.out.println("密码输入成功！");
    }
}
