package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testGetFixedValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Calculator calculator = new Calculator();
        //test
        Method getFixedValuePrivate = Calculator.class.getDeclaredMethod("getFixedValue");
        getFixedValuePrivate.setAccessible(true);
        assertEquals(42,getFixedValuePrivate.invoke(calculator));
    }
}
