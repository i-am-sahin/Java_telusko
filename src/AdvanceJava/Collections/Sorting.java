package AdvanceJava.Collections;

import java.util.*;

//import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class Sorting {
    public static void StringLengthWiseSorting(){
        List<String> names = new ArrayList<>();
        names.add("Sahin");
        names.add("Rishita");
        names.add("Sayak_Mondal");
        names.add("JEET");
        names.add("Rik");
        names.add("Kaustav");


        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length())
                    return 1;
                else
                    return -1;
            }
        };
        System.out.println("Before Sorting values");
        System.out.println(names);
        System.out.println("After Sorting values based On Length of the Names ");
        Collections.sort(names,comp);
        System.out.println(names);
    }
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(53);
        nums.add(35);
        nums.add(13);
        nums.add(82);
        nums.add(45);
        Collections.sort(nums);
        System.out.println(nums);

        //We also can define our own sorting logic using Comparator.

        Comparator<Integer> comm = new Comparator<Integer>() {
            @Override

            //Sort based on the last value
            public int compare(Integer i, Integer j) {
                if(i % 10 >j % 10){
                    return 1; //It'll Swap here
                }
                else
                    return -1; //It'll not swap here!
            }
        };

        Collections.sort(nums,comm);

        System.out.println("After implementing Compare");
        System.out.println(nums);
        StringLengthWiseSorting();


    }
}
