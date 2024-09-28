package test1;

import java.util.Random;
import java.util.Scanner;
public class anli2 {
    public static void main(String args[]){
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入验证码位数：");
        n = sc.nextInt();
        String code = num(n);
        System.out.printf("验证码为：" + code);
    }
    public static String num(int n){
        //0.数字
        //1.小写字母
        //2.大写字母
        Random r = new Random();
        String code = "";
        for(int i = 0; i < n; i++)
        {
            switch(r.nextInt(3))
            {
                case 0:
                    code += r.nextInt(10);
                    break;                       import java.util.Random;
                case 1:                          import java.util.Scanner;
                    code += (char)r.nextInt(26) +public class anli2 { 65;
                    break;                           public static void main(String args[]){
                case 2:                                  int n = 0;
                    code += (char)r.nextInt(26) +     test1/anli2.java:31   Scanner sc = new Scanner(System.in); 97;
                    break;//97-122                       Systest1/anli2.java:31test1/anli2.java:31tem.out.printf("请输入验证码位数：");
            }                                            n = sc.nextInt();
        }                                                String code = num(n);
        return code;                                     System.out.printf("验证码为：" + code);
    }                                                }
}                                                    public static String num(int n){