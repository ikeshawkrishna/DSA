package org.LeetCode.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int[] nums = {1,1};
//        Arrays.sort(nums);

//        for(int n : nums){
//            System.out.println(n);
//        }
        int first = 0,secondLarge = 0;
        //1,8,6,2,5,4,8,3,7
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > first){
                secondLarge = first;
                
                first = nums[i];
            } else if(nums[i] > secondLarge && nums[i]!=first ){
                secondLarge = nums[i];
            }
        }



        System.out.println(secondLarge);
    }
}
