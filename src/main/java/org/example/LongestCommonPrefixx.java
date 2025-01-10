package org.example;

public class LongestCommonPrefixx {
    //write code for parameterized method and test it

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr));
    }

    private static boolean longestCommonPrefix(String[] arr) {
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0 && prefix.length() > 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        if (prefix.length() == 0)
            return true;
        else
                return false;
    }
}
