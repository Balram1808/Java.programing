class Animal{
    public int legCount;
    public void display(){
        System.out.println("I am an animal");
        System.out.println("I have "+ legCount + "legs");
    }
}
public class Inheritance2
{
	public static void main(String[] args) {
		Animal d=new Animal();
		d.legCount=4;
		d.display();
	}
}
