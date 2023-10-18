//Exception Handling
import java.util.*;
public class ExceptionHandling5
{
	public static void main(String[] args) {
	    String s=null;
	    int arr[]={10,20,30};
		try{
		    System.out.println(s.length());
		    System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		    System.out.println("Exception=> " + e);
		}
		catch(NullPointerException e)
		{
		    System.out.println("Exception=> " + e);
		}
	}
}