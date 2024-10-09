package JavaHomework2;
import java.util.Scanner;

public class S2_4_2 {
    public static int IntMax(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
    public static double DoubleMax(double a, double b){
        if(a > b)
            return a;
        else
            return b;
    }
    public static double DoubleThreeMax(double a, double b, double c){
        double max = a;
        if(max < b)
            max = b;
        if(max < c)
            max = c;
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println(IntMax(3,4));
        System.out.println(DoubleMax(3.4,6.3));
        System.out.println(DoubleThreeMax(4.4,6.3,8.6));
    }
}
