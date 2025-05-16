package Core_Java;

class P{
    public void show(){
        System.out.println("In P");
    }
}
class Q extends P{
    public void show(){
        System.out.println("In Q");
    }

}
class R extends P{
    public void show(){
        System.out.println("In R");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        P obj = new Q(); //You can Take Parent class As Reference for creating the child Object.


        P obj = new P();
        obj.show();

        obj = new Q();
        obj.show();

        obj = new R();
        obj.show();

    }
}
