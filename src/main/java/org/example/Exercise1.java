package org.example;

public class Exercise1 {
    public static void main(String[] args) {
        StreamSources.intNumbersStream().forEach(e-> System.out.println(e));
        StreamSources.stringNumbersStream().forEach(e-> System.out.println(e));
    }
}
