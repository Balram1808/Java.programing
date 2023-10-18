//Exception handling//
import java.util.Scanner;
public class Multicatch
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    try{
	   int n=Integer.parseInt(sc.nextLine());
	   if(99%n==0)
	   
	    System.out.println(n+" is a factore of 99");
	   
	    }
	    catch(ArithmeticException Ex)
	    {
	       System.out.println("Arithmetic"+Ex);
	    }
	    catch(NumberFormatException Ex)
	    {
	       System.out.println("NumberFormatException"+Ex);
	    }
	}
}