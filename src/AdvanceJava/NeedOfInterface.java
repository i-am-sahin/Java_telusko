package AdvanceJava;

abstract class  Computer{
    public abstract void code();
}

class Desktop extends  Computer{
    public void code(){
        System.out.println("code, compile, run : Faster");
    }
}

class Laptop extends Computer{
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
