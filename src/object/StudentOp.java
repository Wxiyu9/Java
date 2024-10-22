package object;

public class StudentOp {
    private Student stu;
    public StudentOp(Student stu)
    {
        this.stu = stu;
    }
    public void Pass()
    {
        if(this.stu.getAge() > 18)
        {
            System.out.println(this.stu.getName() + "成年了");
        }
        else
        {
            System.out.println(this.stu.getName() + "未成年");
        }
    }


}
