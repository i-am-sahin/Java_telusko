package Core_Java;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = new Integer(num); //Boxing : Here I manually convert Primitive date to Object
        Integer num2 = num; // Auto-Boxing : Here Java automatically convert Primitive date to Object

        System.out.println(num1.intValue()); //Unboxing : Here I manually convert  Object type To Primitive Type

        int n = num1; // auto-unboxing : Here Java automatically convert  Object type To Primitive Type
    }
}
