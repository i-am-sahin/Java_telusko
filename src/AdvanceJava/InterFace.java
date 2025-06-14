package AdvanceJava;


interface S{
    // By Default Interface's variables are "Final and static"

    int age = 22;
    String area = "Tentulia";

    void show();
    void config();
}


//When you implements 'S' You've to define all the function in this class Or you've to also convert this class to a Abstract Class.
class B implements S{

    @Override
    public void show() {
        System.out.println("In show : ");
    }

    @Override
    public void config() {
        System.out.println("In Config : ");
    }
}

public class InterFace {



    public static void main(String[] args) {
        S obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(S.age);
    }
}
