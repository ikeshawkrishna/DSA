package org.LeetCode.Strings;

public class Reverse_Prefix_of_Word {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        StringBuilder str = new StringBuilder(word.substring(0, index + 1));

       return str.reverse() + word.substring(index+1);
    }
}
