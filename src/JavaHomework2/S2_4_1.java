package JavaHomework2;
import java.util.Scanner;

public class S2_4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生个数：");
        int StudentAmount = sc.nextInt();
        String[] StudentName = new String[StudentAmount];
        double[] StudentGrade = new double[StudentAmount];
        for(int i = 0; i < StudentAmount; i++){
            System.out.print("请输入该学生姓名：");
            StudentName[i] = sc.next();
            System.out.print("请输入该学生成绩：");
            StudentGrade[i] = sc.nextDouble();
        }
        int max = 0;
        int min = 0;
        for(int i = 0; i < StudentAmount; i++){
            if(StudentGrade[max] < StudentGrade[i])
                max = i;
        }
        if(max == 0)
            min = 1;
        for(int i = 0; i < StudentAmount; i++)
        {
            if(StudentGrade[min] < StudentGrade[i] && i != max){
                min = i;
            }
        }
        System.out.println("最高分的学生为：" + StudentName[max]);
        System.out.println("第二高分的学生为：" + StudentName[min]);
    }
}
