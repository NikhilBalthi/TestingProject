package org.example;

import java.util.*;

public class ListOne {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers);

        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("-======-");
        numbers.stream().forEach(System.out::println);
    }
}
