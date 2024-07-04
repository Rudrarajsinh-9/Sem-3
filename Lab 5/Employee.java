import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
       
        Employee_Detail p=new Employee_Detail();
        p.Scan();
        p.Print();

        
    }
}
class Employee_Detail{
        int id;
        String name;
        int salary;
        String Designation;
    public void Scan(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee id  :");
         id=sc.nextInt();   
        System.out.println("enter salary  :");
         salary=sc.nextInt();
         sc.nextLine();
        System.out.println("enter designation  :");
         Designation=sc.nextLine();
         System.out.println("enter emloyee name  :");
         name=sc.nextLine();
    }
    public void Print(){
          System.out.println(" amployee id  :"+id);
          System.out.println("employee name  :"+name);
          System.out.println("employee Salary  :"+salary);
          System.out.println("employee designation  :"+Designation);



    }
    
}
