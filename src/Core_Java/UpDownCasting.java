package Core_Java;

class E{
    public void show1(){
        System.out.println("In E show");
    }

}
class F extends E{
    public void show2(){
        System.out.println("In F show");
    }
}
public class UpDownCasting {
    public static void main(String[] args) {

        //Upcasting
        E obj = new F();
        obj.show1();

        //Downcasting

        F obj1 =(F) obj;
        obj1.show2();


    }
}
