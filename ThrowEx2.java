public class ThrowEx1
{
    public static void checkNum(String s){
        if(s==null){
            throw new ArithmeticException("\nNull");
        }
        
            
    }
	public static void main(String[] args) {
	    ThrowEx1 obj=new ThrowEx1();
	    obj.checkNum(null);
	    
		System.out.println("rest of code");
	}
}