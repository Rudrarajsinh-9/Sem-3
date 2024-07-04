import java.util.Scanner;

public class AddMatrix 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your matrix size ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][]matrix1 = new int[a][b];
        int [][]matrix2 = new int[a][b];
        int [][]matrix = new int[a][b];

        System.out.println("Enter matrix1 ");

        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                matrix1[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter matrix2 ");

        for(int i=0;i<a;i++)
        {
            for(int j=0; j<b; j++)
            {
                matrix2[i][j]= sc.nextInt();
            }
        }

        System.out.println("addition matrix ");

        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                matrix[i][j]= matrix1[i][j]+matrix2[i][j];
            }
          
        }

        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.println(matrix[i][j]+" ");
            }
           
        }

        sc.close();
    }
    
}
