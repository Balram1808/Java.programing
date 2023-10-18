import java.util.Scanner;
public class ExceptionHandling2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    try{
	   int n;
	   
	    System.out.println("enter the value of n");
	    n=sc.nextInt();
	    int divideByZero=5/n;
	   
		  System.out.println("rest of code in try block");
	    }
	    catch(ArithmeticException E)
	    {
	       System.out.println("Arithmetic Exception=>"+E.getMessage());
	    }
	}
}