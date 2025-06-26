package AdvanceJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Name");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        String name = bf.readLine();
        System.out.println(name);
        bf.close();
    }
}
