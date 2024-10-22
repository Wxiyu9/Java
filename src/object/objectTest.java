package object;

public class objectTest {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setName("dfdf");
        s1.setAge(50);
        StudentOp stuop = new StudentOp(s1);
        stuop.Pass();
    }
}
