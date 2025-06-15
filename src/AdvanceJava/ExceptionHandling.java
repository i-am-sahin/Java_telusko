package AdvanceJava;

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        int arr[] = new int[5];
        String str = null;

        try{
            //IF there is any problem in this block then it's not executed,Catch block will.
            j = 18/i;
            System.out.println(str.length());
            System.out.println(arr[2]);
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println("Can't Divide with 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your Limit");
        }
        catch (Exception e){
            System.out.println("Somthing Went Wrong....."  + e);
        }
        System.out.println(j);

    }
}
