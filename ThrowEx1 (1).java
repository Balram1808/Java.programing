public class ThrowEx1
{
    public static void checkNum(int num){
        if(num<1){
            throw new ArithmeticException("\nNumber is negative ,cannot calculate square");
        }
        else{
            	System.out.println("square of"+num+"is"+(num*num));
        }
        
            
    }
	public static void main(String[] args) {
	    ThrowEx1 obj=new ThrowEx1();
	    obj.checkNum(-3);
	    
		System.out.println("rest of code");
	}
}