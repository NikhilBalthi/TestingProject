package org.example;

import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(10,15,8,49,25,31,100);

        a.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
//        System.out.println("Collected list is "+collectedList);

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("anil",1200);
        map1.put("bhavna",1300);
        map1.put("michael",800);
        map1.put("tom",670);
        map1.put("ankit",890);
        map1.put("ankit",890);
        map1.put("ram",890);
        //it doesn't allow duplicates
        System.out.println(map1);
        //{michael=800, tom=670, ankit=890, bhavna=1300, anil=1200}
        Map.Entry<String, Integer> stringIntegerEntry = map1.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList()).get(1); //michael=800
        System.out.println(stringIntegerEntry);
        Map.Entry<String, Integer> results = getNthHighestSalary(1, map1);
        System.out.println("map1" +map1.entrySet());
        System.out.println("the results displayed are "+results);

        for(Map.Entry<String,Integer> entry: map1.entrySet()){
            System.out.println(" entry key - " + entry.getKey() + "en " +
                    "try value - " +entry.getValue());
        }
    }
    public static Map.Entry<String,Integer> getNthHighestSalary(int num,Map<String,Integer> m){
        Map.Entry<String, Integer> stringIntegerEntry1 = m.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num);
        return stringIntegerEntry1;
    }



}
