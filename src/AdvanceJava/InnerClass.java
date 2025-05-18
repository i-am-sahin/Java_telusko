package AdvanceJava;

class A{
    public void show(){
        System.out.println("In Show");
    }
    //Inner Class
    static class B{
        public void config(){
            System.out.println("In Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        //Creating innerClass Object
        A.B obj1= new A.B();

        obj1.config();
    }
}
