package JavaHomework2;
import java.util.Scanner;
//根据出生年份判断属性

public class S2_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入出生年份：");
        int year = sc.nextInt();
        int num = year / 12;
        int result = year - num * 12;
        switch(result)
        {
            case 0:
                System.out.println("您的属性为：猴");
                break;
            case 1:
                System.out.println("您的属性为：鸡");
                break;
            case 2:
                System.out.println("您的属性为：狗");
                break;
            case 3:
                System.out.println("您的属性为：猪");
                break;
            case 4:
                System.out.println("您的属性为：鼠");
                break;
            case 5:
                System.out.println("您的属性为：牛");
                break;
            case 6:
                System.out.println("您的属性为：虎");
                break;
            case 7:
                System.out.println("您的属性为：兔");
                break;
            case 8:
                System.out.println("您的属性为：龙");
                break;
            case 9:
                System.out.println("您的属性为：蛇");
                break;
            case 10:
                System.out.println("您的属性为：马");
                break;
            case 11:
                System.out.println("您的属性为：羊");
                break;
        }
    }
}
