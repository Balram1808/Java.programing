 public class Lamp {
    boolean On;
    void switchOn(){
        On=true;
        System.out.println(On);
    }
    void switchOff(){
        On=false;
        System.out.println(On);
    }
    public static void main(String[] args) {
       Lamp led=new Lamp();
       Lamp halogen=new Lamp();
       led.switchOn();
       halogen.switchOff();
    }
}