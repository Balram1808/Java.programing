class Automobile{
    public void start()
    {
        System.out.println("Engine starts running");
    }
    public void stop()
    {
        System.out.println("Engine stops running");
    }
}
class Car extends Automobile{
    public void No_of_tyres()
    {
        System.out.println("There are 4 types");
    }
    public void fuel()
    {
        System.out.println("Petrol");
    }
    public void fuel(String fuel)
    {
        System.out.println("Also runs on diesel");
    }
    public void seatings()
    {
        System.out.println("4 seating");
    }
}
class Bike extends Automobile{
    public void No_of_tyres()
    {
        System.out.println("There are 2 types");
    }
    public void fuel()
    {
        System.out.println("Petrol");
    }
    public void seatings()
    {
        System.out.println("2 seating");
    }
}
public class Interface1
{
    public static void main(String args[])
    {
        Automobile a=new Automobile();
        a.start();
        a.stop();
        Car c=new Car();
        c.No_of_tyres();
        c.fuel();
        c.fuel("Diesel");
        c.seatings();
        Bike b=new Bike();
        b.No_of_tyres();
        b.fuel();
        b.seatings();
    }
}