package org.LeetCode.Strings;

//  796. Rotate String

// check whether the string s is in same order even after multiple rotations.
public class Rotate_String {

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }

    public static boolean rotateString(String s, String goal) {
        String newStr = s+s;
        System.out.println(newStr);
        if(newStr.contains(goal) && s.length() == goal.length()){
            return true;
        }
        return false;
    }
}
