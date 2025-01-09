package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosToRight {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1,0,-3,0,-1,1,30,0,0,5,-4);
        List<Integer> collectedResult = Stream.concat(numbers.stream().filter(n -> n != 0), numbers.stream().filter(n -> n == 0)).collect(Collectors.toList());
        System.out.println("Collected Result "+collectedResult);

        System.out.println("akhil");

        System.out.println("nikhil");


        System.out.println("ram");

        if(5==3){
            System.out.println("worng");
        }else {
            System.out.println("yes");
        }

    }
}
