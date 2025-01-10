package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class CallableClass {
    public static void main(String[] args) {
        //ExecutorService executorService = new ExecutorService();
        Set<String> nikhil = Set.of("nikhil", "akhil");
        Set<String> singleton = Collections.singleton("ram");
        //
        // System.out.println("singleton "+singleton);

        singleton.add("laxman");
        //singleton
        System.out.println(singleton.stream());
    }
}
