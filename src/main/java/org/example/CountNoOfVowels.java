package org.example;

import java.lang.reflect.Array;
import java.time.DayOfWeek;
import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import reactor.core.publisher.Flux;
public class CountNoOfVowels {
    public static void main(String[] args) {
        String s = "nikhilbalthi";
        char characters[] = s.toCharArray();
        int count = 0;
        for(char c:characters){
            if(List.of('a','e','i','o','u').contains(c)){
                count = count+1;
            }
        }
        System.out.println("the count of vowels is "+count);

        Integer[] values = {1,3,8,4};
        //code for reactive mono type
        List<Integer> list = Arrays.asList(values);
        System.out.println("the count of vowels is "+list.stream().mapToInt(i -> i).filter(i -> List.of(1,3,8,4).contains(i)).count());
        // Create a Flux that emits numbers from 1 to 10 and prints each number to the console
        // Count the number of times each number appears in the Flux
        //import flux
        Flux.range(1, 10)
                .subscribe(System.out::println);
        
    }
}
