package AdvanceJava.Collections;
import javax.swing.*;
import java.util.*;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();


        for (int i = 1; i <= size ;i++){
            nums.add(ran.nextInt(size));
        }
//        int sum = nums.stream()
//                .map(n -> n*2).reduce(0,(c,e) -> c+e);
//        System.out.println(sum);
        long startSeq = System.currentTimeMillis();

        int sum2 = nums.stream().map(n -> {
            try {
                Thread.sleep(1);
            }catch (Exception e){}
            return n * 2;
        }).mapToInt(i -> i).sum();
        long endSeq = System.currentTimeMillis();


        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    }catch (Exception e){}
            return n * 2;
                })
                .mapToInt(i -> i).sum();
        long endPara = System.currentTimeMillis();


        System.out.println(sum2 + " " +  sum3);
        System.out.println("Seq : " + (endSeq - startSeq));
        System.out.println("Para : " + (endPara - startPara));
    }
}
