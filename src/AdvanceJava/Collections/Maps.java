package AdvanceJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap<>();
        student.put("Sahin",56);
        student.put("Navin",23);
        student.put("X",67);
        student.put("Y",93);
        student.put("Sahin",23); //Keys can't be repeated, But the values are!

        System.out.println(student);
        System.out.println(student.get("Y"));


        System.out.println(student.keySet());
        for(String s : student.keySet()){
            System.out.println(s + " : " + student.get(s));
        }

    }
}
