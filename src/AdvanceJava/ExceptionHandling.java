package AdvanceJava;

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 4;
        int j = 0;

        try{
            //IF there is any problem in this block then it's not executed,Catch block will.
            j = 18/i;
        }catch (Exception e){
            System.out.println("Something Went Wrong.");
        }
        System.out.println(j);

    }
}
