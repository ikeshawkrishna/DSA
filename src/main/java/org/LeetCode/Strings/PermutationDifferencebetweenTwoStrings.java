package org.LeetCode.Strings;

// 3146 Permutation Difference between Two Strings
public class PermutationDifferencebetweenTwoStrings {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference1("abc","bac"));
    }

    // O(N^2)
    public static int findPermutationDifference(String s, String t) {

        int value = 0;
        int charVal = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if(s.charAt(i) == t.charAt(j)){
                    charVal = i - j;
                    value = value + Math.abs(charVal);
                }
            }
        }
        return value;
    }

    // O(N)
    public static int findPermutationDifference1(String s, String t) {
        int value = 0;
        int charVal = 0;
        for (int i = 0; i < s.length(); i++) {
            charVal = t.indexOf(s.charAt(i));
            value = value + Math.abs(i - charVal);
        }
        return value;
    }


}
