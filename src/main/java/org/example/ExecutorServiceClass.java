package org.example;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> c1 = ()-> {
            System.out.println("Task 1");
            return 1;
        };

        Callable<Integer> c2 = ()-> 2;
        Callable<Integer> c3 = ()-> 3;
    }
}
