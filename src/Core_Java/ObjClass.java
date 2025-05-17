package Core_Java;
class Laptop{
    String model;
    int price;

//    @Override
//    public String toString() {
//        return model + " : " + price;
//    }

    public boolean equals(Laptop that){
        return this.model == that.model && this.price ==that.price;
    }

}
public class ObjClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "LG Gram";
        obj.price = 1000;
        System.out.println(obj); // output: Core_Java.Laptop@6acbcfc0
        System.out.println(obj.toString()); // output: Core_Java.Laptop@6acbcfc0
        //By default, when we print a object, in background it'll call this ".toString()" Function.


        Laptop obj1 = new Laptop();
        obj1.model = "LG Gram";
        obj1.price = 1000;
        System.out.println(obj.equals(obj1));



    }
}
