package JavaHomework3;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String position;
    private String department;
    private static int attendanceCount;

    public Employee() {
        this.id = 0;
        this.name = "Unknown";
    }

    public Employee(int id, String name, int age, String position, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
    }
    public void sign_in(String name)
    {
        attendanceCount++;
        System.out.println(name + "已经签到，当前共有" + attendanceCount + "人已签到");
    }
    public void displayInfo()
    {
        System.out.println("--------------------");
        System.out.println("编号：" + this.id);
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("职务：" + this.position);
        System.out.println("部门：" + this.department);
    }
}
