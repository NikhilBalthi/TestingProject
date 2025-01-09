package org.example;

import java.util.stream.Stream;
public class StreamSources {
    public static Stream<String> stringNumbersStream(){

        return Stream.of("one","two","three","four","five").limit(2);
    }

    public static Stream<Integer> intNumbersStream(){
        return Stream.iterate(10,i->i+5).limit(5);
    }
}
