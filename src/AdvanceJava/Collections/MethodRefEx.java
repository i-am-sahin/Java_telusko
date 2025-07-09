package AdvanceJava.Collections;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sahin","Sayak","Subho");


//        List<String> uNames = names.stream()
//                .map(str -> str.toUpperCase())
//                .toList();


        //Method Reference

        List<String> uNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(uNames);

//        uNames.forEach(i -> System.out.println(i));

        //Method Reference

        uNames.forEach(System.out::println);
    }
}
