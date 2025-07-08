package AdvanceJava.Collections;

import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);



//        for (int i = 0; i < nums.size();i++) {
//            System.out.println(nums.get(i));
//        }


//        for(int n : nums){
//            System.out.println(n);
//        }


        Consumer<Integer> cons = (Integer n) -> System.out.println(n);




        nums.forEach(cons);









//        int sum = 0;
//        for(int n : nums){
//            if (n % 2 == 0){
//                n = n * 2;
//                sum += n;
//            }
//        }
//        System.out.println(sum);
    }
}
