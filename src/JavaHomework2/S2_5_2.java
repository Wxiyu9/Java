package JavaHomework2;

public class S2_5_2 {
    public static void Swap(int a[][], int b[][])
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                 b[j][i] = a[i][j];
            }
        }
    }
    public static void main(String[] args)
    {
        int[][] a = {{1,2,3},{2,3,4}};
        int[][] b = new int[3][2];
        Swap(a,b);
    }
}
