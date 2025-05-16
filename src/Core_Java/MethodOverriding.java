package Core_Java;

class X{
    public void show(){
        System.out.println("In X's show");
    }
    public void config(){
        System.out.println("In X's Config");
    }
}
class Y extends X{
    public void show() //This method show Overrides the method of Parent class
    {
        System.out.println("In Y's show");
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.show();
        obj.config();
    }
}
