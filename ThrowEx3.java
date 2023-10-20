public class ThrowEx3
{
    public static void checkage(int age)throws ArithmeticException{
        if(age<=18){
            throw new ArithmeticException("\nacces denied you must be 18 year old");
        }
        else{
            	System.out.println("acces granted you old enough");
        }
        
            
    }
	public static void main(String[] args) {
	    
	    checkage(14);
	    
		System.out.println("rest of code");
	}
}
