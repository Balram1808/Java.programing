public class ThrowAndThrows
{
    public static void method() throws ArithmeticException{
        
        	System.out.println("inside the methode");
        	throw new ArithmeticException("throwing ArithmeticException");
            
    }
    
	public static void main(String[] args) {
	    try{
	        method();
	    }
	    catch(ArithmeticException e)
	    {
	      	System.out.println("caught on main() methode");  
	    }
	    
	   	}
}