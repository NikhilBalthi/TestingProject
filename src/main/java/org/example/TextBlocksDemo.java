package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class TextBlocksDemo {
    public static void main(String[] args) {
        String email = """
                hello world
                what is happening right now?
                """;
        System.out.println(email);
        String msg = "friday";
        System.out.println(performTask(msg));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        Integer[] a = list.stream().toArray(size -> new Integer[size]);

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("hello");
        arr2.add("world");

        String[] b = arr2.stream().toArray(String[]::new);

        arr2.stream().toArray(String[]::new);

        System.out.println(Arrays.toString(a));
    }
    public static String performTask(String msg){
        msg = switch(msg){
            case "monday" -> {
                System.out.println("good morning");
                yield "a";
            }
            case "tuesday" -> "good afternoon";
            case "wednesday","thursday","friday" -> "good evening";
            default -> "good night";
        };
        return msg;
    }
}
