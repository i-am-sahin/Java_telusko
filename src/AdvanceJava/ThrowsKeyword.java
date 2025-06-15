package AdvanceJava;


class Abc{
    public void show() throws ClassNotFoundException{ //The method who is calling this method,that method is responsible error handling .
        Class.forName("Hello");

    }
}

public class ThrowsKeyword  {
     static{
        System.out.println("Class Loaded!");
    }
    public static void main(String[] args){
        Abc obj = new Abc();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println(e);;
        }
    }
}
