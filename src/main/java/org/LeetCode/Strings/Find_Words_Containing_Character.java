package org.LeetCode.Strings;

import java.util.ArrayList;
import java.util.List;

//2942. Find Words Containing Character
public class Find_Words_Containing_Character {

    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char ch = 'e';
        System.out.println(findWordsContaining(words,ch));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> value = new ArrayList<>();

        for(int i =0; i<words.length; i++){
            if(words[i].indexOf(x) != -1){
                value.add(i);
            }
//            if(words[i].contains(x+"")){
//                value.add(i);
//            }
        }
        return value;
    }
}
