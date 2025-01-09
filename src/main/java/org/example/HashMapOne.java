package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOne {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(31,"shubham");
        map.put(11,"Akshit");
        System.out.println(map.get(31));
        System.out.println(map.containsKey(31));

        boolean a = map.containsValue("Akshit");
        System.out.println(a);

        Set<Integer> integers = map.keySet();
        for(int i:integers){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

        for(Map.Entry<Integer,String> i:entries){
            System.out.println(i.getKey()+"->"+i .getValue());
            i.setValue(i.getValue().toUpperCase());
            System.out.println(i.getKey()+ " -> "+i.getValue());
        }
    }
}
