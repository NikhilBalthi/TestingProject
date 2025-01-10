package org.example;


import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {
    @Test
    public void testSumOfNumbers(){
        Library library = new Library();
        int sum = library.sumOfNumbers(10,30);

    }

    @Test
    public void testSumOfTwoNumbers() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Library library = new Library();
        Method testSumOfTwoNumbersPrivate =
                Library.class.getDeclaredMethod("sumOfTwoNumbers", Integer.class, Integer.class);
        testSumOfTwoNumbersPrivate.setAccessible(true);

        assertEquals(35,testSumOfTwoNumbersPrivate.invoke(library,15,20));
    }
}
