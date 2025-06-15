package AdvanceJava;

public class FunctionalInterfaces {
    @java.lang.FunctionalInterface
    interface  A{
        void show();
//        void hello();
    }
//    class B implements A {
//        public void show() {
//            System.out.println("In show.....");
//        }
//    }

    public static void main(String[] args) {
        A obj = new A(){
            @Override
            public void show() {
                System.out.println("In Show");
            }
        };
    }

}
