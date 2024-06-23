package org.example.KunalKushwaha.MathsForDSA;

public class Findunique {
    public static void main(String[] args) {
        int[] arr = {2,4,5, 6, 2,4,5, 2,4,5};

        int unique = 0;
        for(int n : arr){
            unique = unique ^ n;
        }

        //System.out.println(unique);


    }
}
