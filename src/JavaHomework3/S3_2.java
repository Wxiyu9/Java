package JavaHomework3;

public class S3_2 {
    public static void main(String[] args)
    {
        MonkeyAssistant assistant1 = new MonkeyAssistant();
        MonkeyAssistant assistant2 = new MonkeyAssistant("皮皮",2,48.0);
        assistant1.printDetails();
        assistant2.printDetails();

        assistant1.climbTree();
        assistant2.climbTree();


        System.out.println("34摄氏度转换为华氏度为：" + assistant1.celsiusToFahrenheit(34));
        System.out.println("33.4摄氏度转换为华氏度为：" + assistant1.celsiusToFahrenheit(33.4));
        System.out.println("88华氏度转换为摄氏度为：" + assistant1.fahrenheitToCelsius(88));
        System.out.println("98.8华氏度转换为摄氏度为：" + assistant1.fahrenheitToCelsius(98.8));

    }
}
