package AdvanceJava.Collections;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sahin","Navin","Laxmi","john");

//        Optional<String> name = names.stream().filter(str -> str.contains("x")).findFirst();

        String name = names.stream().filter(str -> str.contains("x")).findFirst().orElse("Not Found!!");
        System.out.println(name);
    }
}
