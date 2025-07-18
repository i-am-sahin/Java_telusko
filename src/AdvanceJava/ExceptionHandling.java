package AdvanceJava;

//Creating Own Exception Class
class SahinException extends  Exception{
    public SahinException(String str){
        super(str);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;


        try{
            //IF there is any problem in this block then it's not executed,Catch block will.
            j = 18/i;
            if (j == 0)
                throw new SahinException("I don't want to do print zero"); //Here I create a ArithmeticException, and explicitly throwing a error here

        }catch (SahinException e){
            j = 18/1;
            System.out.println("That's the default output." + e);
        }

        catch (Exception e){
            System.out.println("Somthing Went Wrong....."  + e);
        }
        System.out.println(j);

    }
}
