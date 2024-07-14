import java.util.Scanner;
public class TempCtoF
{
	public static void main(String[] args) 
	{
		Conversion c = new Conversion();
		System.out.println("Value in Fahrenheit = "+c.c_to_f());
		System.out.println("Value in Celsius = "+c.f_to_c());
	}
}
class Conversion
{
	double c,f;
	public double c_to_f()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of celsius : ");
		c = sc.nextFloat();

		sc.close();

		return (9/5)*(c+32.0);
		
	}
	public double f_to_c()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of Fahrenheit : ");
		f = sc.nextFloat();

		sc.close();
		
		return (5/9)*(f-32.0);
	}

}