import java.util.Scanner;
public class Student {
    


    public static void main(String[] args) {
       
        Student_Detail s[]= new Student_Detail[5];
        for(int i=0;i<s.length;i++){
            s[i]=new Student_Detail();
            s[i].Scan();
            s[i].print();

        
        }
        
    }
}
class Student_Detail{
        int Enrollment_No;
        String name;
        int Semester;
        int CPI;
    public void Scan(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Enrollment_No :");
         Enrollment_No =sc.nextInt();   
        System.out.println("enter Semester  :");
        Semester=sc.nextInt();
         sc.nextLine();
        System.out.println("enter CPI  :");
         CPI=sc.nextInt();
         System.out.println("enter name  :");
         name=sc.nextLine();
    }
    public void Print(){
          System.out.println(" employee Enrollment_No  :"+Enrollment_No);
          System.out.println("employee name  :"+name);
          System.out.println("employee Sem  :"+Semester);
          System.out.println("employee CPI  :"+CPI);



    }
    
}


