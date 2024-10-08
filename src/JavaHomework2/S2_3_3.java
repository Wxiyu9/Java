package JavaHomework2;

public class S2_3_3 {
    public static Boolean CheckNum(int num,int x){
        while(num != 0){
            if(num % 10 == x)
                return true;
            num /= 10;
        }
        return false;
    }
    public static void FORStyle(){
        int result = 0;
        int amount = 0;
        for(int i = 1; i <= 1000; i++)
        {
            if(CheckNum(i,7) || i % 7 == 0)
            {
                System.out.print(i + " ");
                result += i;
                amount++;
            }
        }
        System.out.println("\n总个数 = " + amount);
        System.out.println("总和 = " + result);
    }
    public static void WHILEStyle(){
        int result = 0;
        int amount = 0;
        int i = 1;
        while(i <= 1000){
            if(CheckNum(i,7) || i % 7 == 0)
            {
                System.out.print(i + " ");
                result += i;
                amount++;
            }
            i++;
        }
        System.out.println("\n总个数 = " + amount);
        System.out.println("总和 = " + result);
    }
    public static void main(String[] args){
        FORStyle();
        System.out.print("\n\n\n");
        WHILEStyle();
    }

}
