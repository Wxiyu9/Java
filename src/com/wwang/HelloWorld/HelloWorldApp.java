package com.wwang.HelloWorld;

import java.util.Scanner;
import java.util.Random;

public class HelloWorldApp {
    public static void main(String[] args) {
        Random r = new Random();
        int rr = r.nextInt(100) + 1;

        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.print("请输入你猜测的数字：");
            int x = s.nextInt();
            if(x == rr)
            {
                System.out.println("恭喜你，猜对了！");
                break;
            }
            else if(x > rr)
            {
                System.out.println("猜大了");
            }
            else if(x < rr)
            {
                System.out.println("猜小了");
            }
        }
    }
}
