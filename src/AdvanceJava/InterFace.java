package AdvanceJava;


interface S{
    // By Default Interface's variables are "Final and static"

    int age = 22;
    String area = "Tentulia";

    void show();
    void config();
}

interface C{
    void run();
}
//You can also extends a Interface
interface D extends C{

}

//When you implements 'S' You've to define all the function in this class Or you've to also convert this class to a Abstract Class.
class B implements S,D{

    @Override
    public void show() {
        System.out.println("In show : ");
    }

    @Override
    public void config() {
        System.out.println("In Config : ");
    }

    //You can Implement More than one interfaces in a Class!
    public void run(){
        System.out.println("Running");
    }
}

public class InterFace {



    public static void main(String[] args) {
        S obj;
        obj = new B();
        obj.show();
        obj.config();
        D obj2 = new B();
        obj2.run();

        System.out.println(S.age);
    }
}
