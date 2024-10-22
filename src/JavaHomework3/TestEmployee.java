package JavaHomework3;

public class TestEmployee {
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee(2310250,"王旭",19,"程序员","技术部门");
        Employee e3 = new Employee(2210250,"好人",20,"运营","运营部门");
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
        e2.sign_in("王旭");
        e3.sign_in("好人");
    }
}
