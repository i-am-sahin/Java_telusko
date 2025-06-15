package AdvanceJava;

public class FunctionalInterfaces {
    @java.lang.FunctionalInterface
    interface  A{
        int add(int i,int j);
//        void hello();
    }
//    class B implements A {
//        public void show() {
//            System.out.println("In show.....");
//        }
//    }

    public static void main(String[] args) {




//        A obj = new A(){
//            public int add(int i,int j){
//                return i + j;
//            }
//        };
        //Lamda Expression

        A obj = ( i, j)-> i + j;


        int result = obj.add(5,5);
        System.out.println(result);
    }

}
