// public class ThreadEx1 extends Thread
// {
// 	public static void main(String[] args) {
// 	    ThreadEx1 Thread=new ThreadEx1();
// 		System.out.println("This code is outside of the thread");
// 	}
// 	public void run()
// 	{
// 	   System.out.println("This code is runnig in the thread"); 
// 	}
// }




// class Main implements Runnable
// {
// 	public static void main(String[] args) {
// 	    Main t1 =new Main();
// 	    Thread t=new Thread(t1);
// 	    t.start();
// 		System.out.println("This code is outside of the thread");
// 	}
// 	public void run()
// 	{
// 	   System.out.println("This code is runnig in the thread"); 
// 	}
// }

// class Main extends Thread

// {
// 	public static void main(String[] args) {
// 	    Main t1 =new Main();
// 	    t1.start();
// 	     Main t2 =new Main();
// 	    t2.start();
// 	     Main t3 =new Main();
// 	    t3.start();
	    
// 		System.out.println("This code is outside of the thread");
// 	}
// 	public void run()
// 	{
// 	   System.out.println("This code is runnig in the thread"); 
// 	}
// }

// import java.util.Scanner;
// class A extends Thread {
//     public void run()
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=10;i++)
//         {
//             System.out.println(n + " x " + i + " = " + n*i);
//         }
//     }
// }
// public class Main {

//   public static void main(String[] args) {
//   A t1 = new A();
//     A t2 = new A();

//     t1.start();
//     t2.start();
//   }

// }




// class ThreadCount extends Thread{
//     ThreadCount(String s)
//     {
//         super(s);
//          System.out.println("new thread created" + this);
//          start();
//     }
//     public  void run() {
//         try
//         {
//             for(int i = 0;i<10;i++)
//             {
//                 System.out.println("new thread created" + this);
//                 Thread.sleep(1500);
                
//             }
//         }
//         catch(Exception e)
//         {
//             System.out.println("currently executing thread is interrupted");
//         }
//          System.out.println("currently executing thread is interrupted");
//     }
//   public static void main (String[] args) {
//       ThreadCount obj = new ThreadCount("s") ;
//   } 
// } 


public class MultithreadingDemo implements Runnable {

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running by Java");
        } catch (Exception e) {
            System.out.println("Exception is caught here");
        }
    }

    public static void main(String[] args) {
        int n = 10; 

        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new MultithreadingDemo());
            thread.start();
        }
    }
}




