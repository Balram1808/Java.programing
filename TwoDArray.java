public class TwoDArray
{
	public static void main(String[] args) {
	    int [][]a={{10,20},{30,40},{50,60}};
	        System.out.println("2D Array Elements are: ");
	        for(int i[]: a)
	        {
	            for(int j: i)
	            {
	                System.out.print(j+ " ");
	            }
	            System.out.println();
	        }
	}
}