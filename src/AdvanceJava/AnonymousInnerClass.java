package AdvanceJava;

abstract class P{
    public abstract void show();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        //Anonymous Inner Class
        P obj = new P(){
            public void show(){
                System.out.println("In new show!");
            }
        };
        obj.show();
    }
}
