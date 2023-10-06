//to demonstrate method overriding  and inheritance
class Animal{
    public void eat(){
        System.out.println("method eat in parent class");
    }
}
class Dog extends Animal
{
    public void eat(){
        System.out.println("Method eat in subclass");
    }
    public void bark(){
        System.out.println("Bark");
    }
}
public class InheritanceOverriding
{
	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d=new Dog();
		a.eat();
		d.eat();
		d.bark();
	}
}