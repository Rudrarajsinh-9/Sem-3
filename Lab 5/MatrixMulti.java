import java.util.Scanner;
public class MatrixMulti
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your matrix size ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(r2!=c1)
        {
            System.out.println("its not possiable");
        }
        else
        {
        int [][]matrix1 = new int[r1][c1];
        int [][]matrix2 = new int[r2][c2];
        int [][]matrix = new int[r1][c2];

        System.out.println("Enter matrix1 ");

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                matrix1[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter matrix2 ");

        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                matrix2[i][j]= sc.nextInt();
            }
         }
        System.out.println(" result matrix");
        for(int i=0;i<r1;i++)
        {
    for(int j=0;j<c2;j++)
    {
    for(int k=0 ;k<c1;k++)
    {
        matrix[i][j]+=matrix1[i][k]*matrix2[k][j];
    }
    }
    }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                 System.out.print(matrix[i][j]+" ");
            }
   
    }

    }
        sc.close();
    }
}