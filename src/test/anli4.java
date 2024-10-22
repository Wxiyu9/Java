package test;
//拷贝数组

public class anli4 {
    public static int[] CopyArr(int[] origin)
    {
        int[] result = new int[origin.length];
        for(int i = 0 ; i < origin.length; i++)
        {
            result[i] = origin[i];
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] origin = {1,2,3,4,5,6};
        int result[] = CopyArr(origin);

    }
}
