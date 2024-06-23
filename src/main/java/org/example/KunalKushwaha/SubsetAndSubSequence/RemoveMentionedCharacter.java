package org.example.KunalKushwaha.SubsetAndSubSequence;

public class RemoveMentionedCharacter {
    public static void main(String[] args) {
        System.out.println(RemoveCharacter("cdaad","",0,'a'));
    }

    private static String RemoveCharacter(String Value,String NewString,int i,char c){
        if(i == Value.length()){
            return NewString;
        }

        if(Value.charAt(i) != c){
            NewString += Value.charAt(i);
        }

        return RemoveCharacter(Value,NewString,i+1,c);
    }
}
