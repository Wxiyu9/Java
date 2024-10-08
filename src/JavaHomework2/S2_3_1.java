package JavaHomework2;

public class S2_3_1 {
    public static void main(String[] args)
    {
        double j = 3;
        double result = 0;
        for(double i = 1; i <= 97; i += 2,j += 2)
        {
            result += i / j;
        }
        System.out.println(result);
    }
}
