package AdvanceJava;
class Show1 extends Thread{
    public void run(){
        for (int i = 0; i < 100;i++){
            System.out.println("Hii!!!");
        }
    }
}
class Show2 extends Thread{
    public void run(){
        for (int i = 0; i < 100;i++){
            System.out.println("Hello!!!");
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        Show1 obj1 = new Show1();
        Show2 obj2 = new Show2();
        obj1.start();
        obj2.start();
    }
}
