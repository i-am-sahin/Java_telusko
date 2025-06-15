package AdvanceJava;

interface Computer{
    void code();
}

class Desktop implements   Computer{
    public void code(){
        System.out.println("code, compile, run : Faster");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Developer{
    public void devApp(Computer laptop){
        laptop.code();
    }
}


public class NeedOfInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer sahin = new Developer();
        sahin.devApp(desk);
    }


}
