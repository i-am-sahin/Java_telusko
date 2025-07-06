package AdvanceJava.Collections;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(54);
        list.add(21);
        list.add(98);
        list.add(90);

        //IF you want to print value of arrayLists, You can directly Print that. Don't Need to Use a Loop here!

        System.out.println(list);

        //Printing values one by one

        for(Object n : list){
            System.out.println(n);
        }

    }
}
