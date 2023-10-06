/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Array6
{
	public static void main(String[] args) {
	    int[]a={1,2,3,4,5};
	    int sum=0;
	    for(int i=0;i<a.length;i++)
	    {
	        sum=sum+a[i];
	    }
	    System.out.println("sum = "+sum);
	    System.out.println("avg = "+sum/a.length);
	}
}