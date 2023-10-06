/******************************************************************************
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
*******************************************************************************/
import java.util.Scanner;
public class Array4
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
	}
}