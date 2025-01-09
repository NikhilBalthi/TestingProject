package org.example;

import static org.example.ValidParenthesis.isValid;

public class ValidParenthesisUsingHashMap {
    public static void main(String[] args) {
        boolean result = isValid("()");
        System.out.println("the result is "+result);
    }
}
