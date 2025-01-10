package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,5,12,3,3,6,2,22,-1);

        System.out.println(nums instanceof ArrayList<Integer>);

        List<Integer> sortedList = nums.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedList is "+sortedList);

        List<Integer> reverseOrder = nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("reverse order of values are "+reverseOrder);

        List<Integer> limitThree = nums.stream().limit(3).sorted().collect(Collectors.toList());
        System.out.println("limit of three is "+limitThree);

        Integer reducedToSum = nums.stream().limit(3).reduce((p, q) -> p + q).get();
        System.out.println("numbers are reduced to Sum "+reducedToSum);

        List<Integer> skipOfTwo = nums.stream().skip(2).collect(Collectors.toList());
        System.out.println("skip of Two Values are "+skipOfTwo);

        Integer sumAfterSkipOfOneValue = nums.stream().skip(1).reduce((p, q) -> p + q).get();
        System.out.println("sumAfterSkipOfOneValue is "+sumAfterSkipOfOneValue);

        Integer secondHighest = nums.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println("secondHighest is "+secondHighest);

        System.out.println("===================");
        System.out.println("sorted order is "+sortedList);


        Integer secondLowest = nums.stream().sorted().skip(1).limit(1).findFirst().get();
        System.out.println("secondLowest is "+ secondLowest);

        Integer maxValue = nums.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("maxValue is "+maxValue);

        Integer minValue = nums.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("minValue is "+minValue);

        List<Integer> distinctList = nums.stream().distinct().collect(Collectors.toList());
        boolean allOrNone = nums.stream().allMatch(i -> i % 2 == 0);
        System.out.println(allOrNone);

        boolean anyOrNone = nums.stream().anyMatch(i -> i % 2 == 0);
        System.out.println(anyOrNone);

        System.out.println(distinctList);
        System.out.println();
        System.out.println("Hello world!");

        List<String> namesString = Arrays.asList("Peter","Sam","George");
        for(String s :namesString){
            if(!s.equals("Peter")){
                System.out.println(s);
            }
        }
        System.out.println("filtered with out Sam");
        namesString.stream().filter(n-> isNotSam(n)).
                forEach(System.out::println);

        double AvgAsDouble = nums.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("avg as double "+AvgAsDouble);

        double greaterThan100asDouble = nums.stream().map(e -> e * e).filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble();
        System.out.println("greater than 100 as double "+greaterThan100asDouble);

        List<Integer> evenNos = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("even nos are "+evenNos);
        List<Integer> oddNos = nums.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("odd nos are "+oddNos);

        List<Integer> listStartsWith2 = nums.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(listStartsWith2);


    }

    private static boolean isNotSam(String n) {
        return !n.equals("Sam");
    }
}