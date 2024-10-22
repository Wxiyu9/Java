package JavaHomework3;

public class MonkeyAssistant {
    private String name;
    private int age;
    private double weight;
    private String hobby;
    private double temperature;

    public MonkeyAssistant() {
    }

    public MonkeyAssistant(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public MonkeyAssistant(String name, int age, double weight, String hobby, double temperature) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.hobby = hobby;
        this.temperature = temperature;
    }

    public void climbTree()
    {
        System.out.println("Monkey " + this.name + " is climbing a tree");
    }

    public void printDetails()
    {
        System.out.println("姓名：" + this.name + "\n年龄" + this.age + "\n体重" + this.weight + "\n爱好" + this.hobby);
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }

    public double celsiusToFahrenheit(double celsius)
    {
        return celsius * 1.8 + 32.0;
    }

    public double celsiusToFahrenheit(int celsius)
    {
        return celsius * 1.8 + 32.0;
    }

    public double fahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32.0) / 1.8;
    }

    public double fahrenheitToCelsius(int fahrenheit)
    {
        return (fahrenheit - 32.0) / 1.8;
    }
}
