package AdvanceJava.Collections;

import java.lang.constant.Constable;
import java.util.*;
import java.util.stream.Stream;


public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);



//        for (int i = 0; i < nums.size();i++) {
//            System.out.println(nums.get(i));
//        }


//        for(int n : nums){
//            System.out.println(n);
//        }


//        Consumer<Integer> cons = (Integer n) -> System.out.println(n);


//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n* 2);
//
//        int result = s3.reduce(0,(c,e) ->c+e);

        //Implementing Filter Function
//        Predicate<Integer> p = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n % 2 == 0;
//            }
//        };
                //Lamda Expression
//        Predicate<Integer> p= n-> n%2==0;




        //Implementing .map Function
//        Function<Integer,Integer> fun = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer n) {
//                return n * 2;
//            }
//        };

                //Lambda Expression
//        Function<Integer,Integer> fun= n-> n*2;



      int result =   nums.stream()
                        .filter(n -> n % 2 == 0)
                                .map(n -> n* 2)
                                        .reduce(0,(c,e) -> c + e);

        System.out.println(result);


       Stream<Integer> sortedValue =   nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n* 2)
                .sorted();

       sortedValue.forEach(n -> System.out.println(n));


//        s3.forEach(n -> System.out.println(n));

//        s1.forEach(n -> System.out.println(n));
//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
//	at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:311)
//	at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:807)
//	at AdvanceJava.Collections.StreamApi.main(StreamApi.java:32)








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
