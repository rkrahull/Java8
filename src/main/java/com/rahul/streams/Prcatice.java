package com.rahul.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Prcatice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,4,1,6,3,9,5,2,1,4,3,2,8,9);

        //#Calculate Average of Integers using Streams
        double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println(average);

        //#Sum of Even and Odd Numbers in a List using Streams
        int sumEven = list.stream().filter(val -> val%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sumEven);

        int sumOdd = list.stream().filter(val -> val%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOdd);


        //#Find Maximum and Minimum Values in a List of Integers using Streams
        //System.out.println(list.stream().min((a,b)->(a-b)).get());
        System.out.println(list.stream().min(Integer::compare).get());

        //System.out.println(list.stream().max((a,b)->(a-b)).get());
        System.out.println(list.stream().max(Integer::compare).get());


        //#Find Second Smallest and Largest Elements in a List of Integers using Streams
        int secSmallest = list.stream().distinct().sorted().skip(1).findFirst().get();
        System.out.println(secSmallest);

        int secLargest = list.stream().distinct().sorted((a, b)->(b-a)).skip(1).findFirst().get();
        System.out.println(secLargest);

    }
}
