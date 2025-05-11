package Core_Java;
class Mobile1{
    String Brand;
    int Price;
    static String Name;

    static {
        Name = "SmartPhone";
        System.out.println("Print From Static Block!!!");
    }

    Mobile1(){
        System.out.println("Print From Constructor!!!");
    }


    public void show(){
        System.out.println(Brand + " : " + Price + " : " + Name);
    }



}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
//        Mobile1 obj1 = new Mobile1();
//        obj1.Brand = "Apple";
//        obj1.Price = 1500;
//        Mobile.Name = "Smart Phone";
//
//        Mobile1 obj2 = new Mobile1();
//        Mobile1 obj3 = new Mobile1();
        //Loading Class without creating the Object
        Class.forName("Core_Java.Mobile1");
    }
}
