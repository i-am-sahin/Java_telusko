package Core_Java;
class Mobile{
    String Brand;
    int Price;
    static String Name;
    public void show(){
        System.out.println(Brand + " : " + Price + " : " + Name);
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
    }
}
