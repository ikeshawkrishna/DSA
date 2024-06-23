package org.example.Leetcode;

public class NumberOfStepsReduceToZero {
    public static void main(String[] args) {
        System.out.println(helper(8));
    }
    public int numberOfSteps(int num) {
        int ans = helper(num);
        return ans;
    }

    private static  int helper(int num) {
        int steps = 0;
        while(num != 0){
            if(num % 2 == 0){
                steps++;
                num = num / 2;
            } else {
                num = num - 1;
                steps++;
            }

        }
        return steps;
    }
}
