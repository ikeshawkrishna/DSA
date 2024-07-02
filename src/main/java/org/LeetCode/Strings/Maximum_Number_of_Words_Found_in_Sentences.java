package org.LeetCode.Strings;

public class Maximum_Number_of_Words_Found_in_Sentences {

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        String[] splitArray;
        int maxLen =0;
        for(String str : sentences){

            splitArray = str.split(" ");
            if (splitArray.length > maxLen){
                maxLen = splitArray.length;;
            }
        }
        return maxLen;
    }
}
