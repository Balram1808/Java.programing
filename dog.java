class Animal{
    protected void display()
    {
        System.out.println("I am an animal");
    }
}
class dog extends Animal
{
	public static void main(String[] args) {
		dog d=new dog();
		d.display();
	}
}