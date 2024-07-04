import java.util.Scanner;
public class Swapnum {

    static void swap(int a,int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("ans : ");
System.out.println(a);
System.out.println(b);

    }
    public static void main(String[] args) {
       
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter A");
        int a= sc.nextInt();
        System.out.println("Enter B");
        int b= sc.nextInt();

swap(a,b);

sc.close();
    }
}
