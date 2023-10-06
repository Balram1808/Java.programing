/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Array5
{
	public static void main(String[] args) {
	    int[][] board=new int[3][3];
	    for(int i=0;i<board.length;i++)
	    {
	        for(int j=0;j<board[i].length;j++)
	        {
	            board[i][j]=i+j;
	        }
	    }
	    for(int i=0;i<board.length;i++)
	    {
	        for(int j=0;j<board[i].length;j++)
	        {
	            System.out.print(board[i][j]+" ");
	        }
	        System.out.println();
	    }
	    System.out.println("Another way");
	    System.out.print(Arrays.deepToString(board));
	}
}