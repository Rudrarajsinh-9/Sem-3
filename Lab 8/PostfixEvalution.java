
import java.util.Scanner;
import java.util.Stack;

public class PostfixEvalution 
{

    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String exp = sc.nextLine();
        
        int value = 0;
        exp = exp + " ";

        sc.close();

        while (exp.charAt(value) != ' ') 
        {
            if (Character.isDigit(exp.charAt(value))) 
            {
                st.push(Integer.parseInt(""+ exp.charAt(value)));
            } else 
            {
                int op2 = st.pop();
                int op1 = st.pop();
                int ans = 0;
                if (exp.charAt(value) == '+') 
                {
                    ans = op1 + op2;
                }
                else if (exp.charAt(value) == '-') 
                {
                    ans = op1 - op2;
                }
                else if (exp.charAt(value) == '*') 
                {
                    ans = op1 * op2;
                }
                else if (exp.charAt(value) == '/') 
                {
                    ans = op1 / op2;
                }
                else if (exp.charAt(value) == '^') 
                {
                    ans = (int) Math.pow(op1, op2);
                } else 
                {
                    System.out.println("Invalid Expression");
                }
                st.push(ans);
            }
            value++;
        }
        System.out.println(st.pop());
    }
    
}
