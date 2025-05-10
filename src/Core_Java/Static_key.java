package Core_Java;
class Mobile{
    String Brand;
    int Price;
    static String Name;
    public void show(){
        System.out.println(Brand + " : " + Price + " : " + Name);
    }
//    public static void show1(){
////        System.out.println("It's a Static Method");
//        System.out.println(Brand + " : " + Price + " : " + Name); //It's Gives Error We Can not use non Static variable inside a Static Method.
//    }

    public static void show1(Mobile obj){
    //        System.out.println("It's a Static Method");
        System.out.println(obj.Brand + " : " + obj.Price + " : " + Name); //It's Gives Error We Can not use non Static variable inside a Static Method.
    }

}
public class Static_key {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.Price = 1500;
        Mobile.Name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Samsung";
        obj2.Price = 1700;
//        Mobile.Name = "Smart Phone";

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }
}
