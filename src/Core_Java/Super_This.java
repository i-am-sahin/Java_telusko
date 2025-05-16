package Core_Java;

class A{
    public A(){
        System.out.println("In A");
    }
    public A(int a){
        System.out.println("In A int");
    }
}

class B extends  A{
    public B(){

        System.out.println("In B ");
    }
    public B(int b){
        this();


        System.out.println("In B Int");
    }
}

public class Super_This {
    public static void main(String[] args) {
        B obj = new B(1);

    }
}
