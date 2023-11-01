import java.util.Scanner;
class A extends Thread {
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=10;i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
public class Main {

  public static void main(String[] args) {
   A t1 = new A();
    A t2 = new A();

    t1.start();
    t2.start();
  }

}