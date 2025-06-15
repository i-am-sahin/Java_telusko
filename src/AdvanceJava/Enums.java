package AdvanceJava;
enum Status{
    Running,failed,Pending,Success;
}
public class Enums {
    public static void enumsWithIfElse(){
        Status s = Status.Running;
        if(s == Status.Running)
            System.out.println("All Good");
        else if (s == Status.failed) {
            System.out.println("Try Again!!!");
        }
        else if(s == Status.Pending){
            System.out.println("Please Wait");
        }else
            System.out.println("Done");
    }
    // Enums Also works With Swich Cases!!
    public static void enumsWithSwichCase(){
        Status s = Status.Success;
        switch (s){
            case Running :
                System.out.println("All Good");
                break;
            case failed:
                System.out.println("Try Again!!!");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }

    public static void main(String[] args) {
        Status[] s = Status.values();
//        System.out.println(s.ordinal());


//        for (Status ss : s){
//            System.out.println(ss + " : " + ss.ordinal());
//        }
        enumsWithIfElse();
        enumsWithSwichCase();
    }


}
