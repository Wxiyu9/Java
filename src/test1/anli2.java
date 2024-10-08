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
                    break;
                case 1:
                    code += (char)r.nextInt(26);
                    break;
                case 2:
                    code += (char)r.nextInt(26);
                    break;//97-122
            }
        }
        return code;
    }
}