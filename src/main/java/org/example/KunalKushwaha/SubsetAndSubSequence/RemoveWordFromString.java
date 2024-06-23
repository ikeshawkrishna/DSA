package org.example.KunalKushwaha.SubsetAndSubSequence;

public class RemoveWordFromString {
    public static void main(String[] args) {
        String value = "India is my contry. I love India";
        System.out.println(RemoveString(value,"india"));
    }



    private static String RemoveString(String value,String target){

        String[] arr = value.split(" ");
        String newValue = "";
        for(String str : arr){
            if (!str.equalsIgnoreCase(target)){
                newValue += (str + " ");
            }
        }

        return newValue.strip();
    }
}
