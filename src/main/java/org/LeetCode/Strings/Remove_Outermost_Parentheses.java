package org.LeetCode.Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
    String str = "l|*e*et|c**o|*de|";
    String[] splitArr = str.split("|");
    String val = "";
    int count = 0;
        for (int i = 0; i < splitArr.length; i=i+2) {
            val = splitArr[i];
            for (int j = 0; j < val.length(); j++) {
                if(val.charAt(j) == '*'){
                    count++;
                }
            }
        }


        System.out.println(count);
    }




}
