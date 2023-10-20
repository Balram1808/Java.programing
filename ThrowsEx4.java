public class ThrowsEx4
{
    public static int divide(int m,int n) throws ArithmeticException{
        int div=m/n;
        return 0;
        
            
    }
    
	public static void main(String[] args) {
	    ThrowsEx4 o=new ThrowsEx4();
	    try{
	        System.out.println(o.divide(45,0));
	    }
	    catch(ArithmeticException e)
	    {
	      	System.out.println("Number cannot be divided by zero");  
	    }
	    
	}
}