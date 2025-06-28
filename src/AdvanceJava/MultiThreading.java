package AdvanceJava;
//class Show1 implements Runnable{
//    public void run(){
//        for (int i = 0; i < 100;i++){
//            System.out.println("Hii!!!");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class Show2 implements Runnable{
//    public void run(){
//        for (int i = 0; i < 100;i++){
//            System.out.println("Hello!!!");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
public class MultiThreading {
    public static void main(String[] args) {
        Runnable obj1 = ()-> {
                for (int i = 0; i < 100;i++){
                    System.out.println("Hii!!!");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        Runnable obj2 = ()-> {
            for (int i = 0; i < 100;i++){
                System.out.println("Hello!!!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj2);
        Thread t2 = new Thread(obj1);

        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.start();
    }
}
