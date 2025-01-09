package org.example;

import java.util.HashSet;
import java.util.List;

public class Pangram {
        public boolean checkIfPangram(String sentence) {
            HashSet<Character> a = new HashSet<>();
            for(char c:sentence.toCharArray()){
                a.add(c);
            }
            return a.size()==26;
        }

    public static void main(String[] args) {
        Pangram p = new Pangram();
        boolean result = p.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(" the result is "+result);
    }

}
