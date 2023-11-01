public class ThreadEx1 extends Thread
{
	public static void main(String[] args) {
	    ThreadEx1 Thread=new ThreadEx1();
		System.out.println("This code is outside of the thread");
	}
	public void run()
	{
	   System.out.println("This code is runnig in the thread"); 
	}
}