package AdvanceJava.Collections;

import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, String name){
         this.age = age;
         this.name = name;

    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Sorting {
//    public static void StringLengthWiseSorting(){
//        List<String> names = new ArrayList<>();
//        names.add("Sahin");
//        names.add("Rishita");
//        names.add("Sayak_Mondal");
//        names.add("JEET");
//        names.add("Rik");
//        names.add("Kaustav");
//
//
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if (s1.length() > s2.length())
//                    return 1;
//                else
//                    return -1;
//            }
//        };
//        System.out.println("Before Sorting values");
//        System.out.println(names);
//        System.out.println("After Sorting values based On Length of the Names ");
//        Collections.sort(names,comp);
//        System.out.println(names);
//    }
    public static void main(String[] args) {
//        List <Integer> nums = new ArrayList<>();
//        nums.add(10);
//        nums.add(53);
//        nums.add(35);
//        nums.add(13);
//        nums.add(82);
//        nums.add(45);
//        Collections.sort(nums);
//        System.out.println(nums);

        //We also can define our own sorting logic using Comparator.

//        Comparator<Integer> comm = new Comparator<Integer>() {
//            @Override
//
//            //Sort based on the last value
//            public int compare(Integer i, Integer j) {
//                if(i % 10 >j % 10){
//                    return 1; //It'll Swap here
//                }
//                else
//                    return -1; //It'll not swap here!
//            }
//        };

//        Collections.sort(nums,comm);

//        System.out.println("After implementing Compare");
//        System.out.println(nums);
//        StringLengthWiseSorting();



        List<Student> studentDetails = new ArrayList<>();


        //We can also manually Implement Comperator here And Override Comparable!!

        Comparator<Student> compForStudent  = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        studentDetails.add(new Student(21,"Sahin"));
        studentDetails.add(new Student(22,"Sayak"));
        studentDetails.add(new Student(23,"Samin"));
        studentDetails.add(new Student(24,"Kaustav"));
        studentDetails.add(new Student(20,"Jeet"));
        System.out.println("Before sorting Based On Age of students");
        System.out.println(studentDetails);
        for (Student s : studentDetails){
            System.out.println(s);
        }

        System.out.println("After sorting Based On Age of students");
        Collections.sort(studentDetails);
        for (Student s : studentDetails){
            System.out.println(s);
        }


    }
}
