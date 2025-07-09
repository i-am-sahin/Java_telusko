package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Students{
    private String name;
    private int age;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ConstructorReferences {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sahin","Sayak","Subho");


        List<Students> students = new ArrayList<>();
//        for (String str : names){
//            students.add(new Students(str));
//        }

//        students = names.stream().map(name -> new Students(name)).toList();


        //Constructor References
        students = names.stream()
                .map(Students::new)
                .toList();
        System.out.println(students);
    }
}
