package org.LeetCode.Strings;

// 3110. Score of a String
public class Score_of_a_String {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }

    public static int scoreOfString(String s) {
        int value = 0;
        int charVal = 0;
        for (int i = 0; i < s.length()-1; i++) {
            charVal = s.charAt(i) - s.charAt(i+1);
            value = value + (Math.abs(charVal));
        }
        return value;
    }
}
