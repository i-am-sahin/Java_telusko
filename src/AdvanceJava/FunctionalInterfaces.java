package AdvanceJava;

public class FunctionalInterfaces {
    @java.lang.FunctionalInterface
    interface  A{
        void show(int i);
//        void hello();
    }
//    class B implements A {
//        public void show() {
//            System.out.println("In show.....");
//        }
//    }

    public static void main(String[] args) {
        //Lamda Expression
        A obj = (i)->{
            System.out.println("In show " + i);
        };
        obj.show(5);
    }

}
