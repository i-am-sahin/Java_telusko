package AdvanceJava;

 abstract class Car{
    public abstract void drive();
    public void playMusci(){
        System.out.println("Playing Music!");
    }
    public abstract void fly();
    
}
abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}
class UpdatedWagonR extends WagonR{  // Concrete Class
    public  void fly(){
        System.out.println("Flying");
    }
}


public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusci();
        
    }
}
