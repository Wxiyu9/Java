package JavaHomework2;

public class S2_3_2 {
    public static void main(String[] args)
    {
        int x = 100;
        int hour = 0;
        while(x > 0)
        {
            hour++;
            x -= 4;
            if(x <= 0)
                break;
            x++;
        }
        System.out.println(hour);
    }
}
