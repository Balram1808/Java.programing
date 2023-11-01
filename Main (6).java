class Main extends Thread

{
	public static void main(String[] args) {
	    Main t1 =new Main();
	    t1.start();
	     Main t2 =new Main();
	    t2.start();
	     Main t3 =new Main();
	    t3.start();
	    
		System.out.println("This code is outside of the thread");
	}
	public void run()
	{
	   System.out.println("This code is runnig in the thread"); 
	}
}