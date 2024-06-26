package org.LeetCode.Strings;

// 771. Jewels and Stones
//Need to find no of charater of jewels present in stones String
public class Jewels_and_Stones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }

    //O(N)
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i)) > -1){
                count++;
            }
        }
        return count;
    }
}
