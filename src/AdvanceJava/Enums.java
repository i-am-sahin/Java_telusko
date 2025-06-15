package AdvanceJava;
enum Status{
    Running,failed,Pending,Success;
}
public class Enums {

    public static void main(String[] args) {
        Status[] s = Status.values();
//        System.out.println(s.ordinal());


        for (Status ss : s){
            System.out.println(ss + " : " + ss.ordinal());
        }
    }


}
