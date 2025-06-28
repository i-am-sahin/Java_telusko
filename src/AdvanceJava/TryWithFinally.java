package AdvanceJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class TryWithFinally {
    public static void main(String[] args) throws Exception{
//        int i = 0;
//        int j = 0;
//        try{
//            j = 18/i;
//        } catch (Exception e) {
//            System.out.println("Something Went wrong");
//        }
//        finally {
//            System.out.println("Bye");
//        }



        //Try without Catch
//        int num;
//        BufferedReader br = null;
//        try{
//            br = new BufferedReader(new InputStreamReader(System.in));
//            num = Integer.parseInt(br.readLine());
//        }finally {
//            br.close();
//        }

        //Try With Resources


        int num;
            //It automatically Close the resources,Because BufferedReader Class Implements Closeable.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){

            num = Integer.parseInt(br.readLine());
        }

    }
}
