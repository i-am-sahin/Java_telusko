package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Sets {
    public static void main(String[] args) {
        Collection<Integer> list = new HashSet<Integer>();
        list.add(54);
        list.add(21);
        list.add(98);
        list.add(90);
        list.add(21);
        list.add(98);



//        System.out.println(list);
//
//
//
//        for(int n : list){
//            System.out.println(n);
//        }


        //We can  use Iterator interface to fetch the values

        Iterator<Integer> values = list.iterator();

        while(values.hasNext())
            System.out.println(values.next());
    }
}
