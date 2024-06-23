package org.example.KunalKushwaha.SubsetAndSubSequence;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceOfString {
    public static void main(String[] args) {
        //SubSequence("","abc");
        SubSequenceAscii("","abc");
        List<String> list = new ArrayList<>();
        //System.out.println(SubSequenceAsList("","abc",list));
    }

    private static void SubSequence(String p,String up){
        if(up.isEmpty()){
            if(!p.isEmpty()){
                System.out.println(p);
            }
            return;
        }

        char ch = up.charAt(0);
        SubSequence(p + ch,up.substring(1));
        SubSequence(p,up.substring(1));
    }

    private static void SubSequenceAscii(String p,String up){
        if(up.isEmpty()){
            if(!p.isEmpty()){
                System.out.println(p);
            }
            return;
        }

        char ch = up.charAt(0);
        SubSequenceAscii(p + ch,up.substring(1));
        SubSequenceAscii(p,up.substring(1));
        SubSequenceAscii(p + (ch + 0),up.substring(1));
    }

    private static List<String> SubSequenceAsList(String p, String up, List<String> list){
        if(up.isEmpty()){
            if(!p.isEmpty()){
                list.add(p);
            }
            return list;
        }

        char ch = up.charAt(0);
        SubSequenceAsList(p + ch,up.substring(1),list);
        SubSequenceAsList(p,up.substring(1),list);

        return list;
    }
}
