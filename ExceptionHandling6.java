//Exception Handling
import java.util.*;
public class ExceptionHandling6
{
	public static void main(String[] args) {
		try{
		    int x=10;
		    int y=0;
		    int z=x/y;
		    System.out.println(z);
		}
		catch(Exception e)
		{
		    System.out.println("Exception=> " + e);
		}
	}
}