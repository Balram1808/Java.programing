//This is a program for autoboxing
public class Autoboxing
{
	public static void main(String args[])
	{
	float a=1.23F;
	Float i=Float.valueOf(a);
	Float j=a;
	System.out.println(a+" "+i+" "+j);

	char a1='A';
	Character x=Character.valueOf(a1);
	Character y=a1;
	System.out.println(a1+" "+x+" "+y);

	int a2=12;
	Integer x2=Integer.valueOf(a2);
	Integer y2=a2;
	System.out.println(a2+" "+x2+" "+y2);

	byte a3=22;
	Byte x3=Byte.valueOf(a3);
	Byte y3=a3;
	System.out.println(a3+" "+x3+" "+y3);

	long a4=1222L;
	Long x4=Long.valueOf(a4);
	Long y4=a4;
	System.out.println(a4+" "+x4+" "+y4);

	double a5=3333;
	Double x5=Double.valueOf(a5);
	Double y5=a5;
	System.out.println(a5+" "+x5+" "+y5);

	boolean a6=true;
	Boolean x6=Boolean.valueOf(a6);
	Boolean y6=a6;
	System.out.println(a6+" "+x6+" "+y6);

	short a7=44;
	Short x7=Short.valueOf(a7);
	Short y7=a7;
	System.out.println(a7+" "+x7+" "+y7);
	}
}	