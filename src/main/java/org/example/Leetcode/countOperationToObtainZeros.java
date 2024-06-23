package org.example.Leetcode;

//Count Operations to Obtain Zero 2169
public class countOperationToObtainZeros {

    public static void main(String[] args) {
        System.out.println(helper(2,3));
    }
    public static int helper(int num1, int num2){
        int steps = 0;
        if(num1 == 0 || num2 == 0){
            return 0;
        }
        while(num1!=num2){
            if(num1 < num2){
                num2 = num2 - num1;
                steps++;
            } else {
                num1 = num1 - num2;
                steps++;
            }
        }
        steps++;
        return steps;
    }

    public static int helperRecursion(int num1, int num2,int steps){
        if(num1 == 0 || num2 == 0){
            return 0;
        }
        if(num1 == num2){
            steps++;
            return steps;
        }
        return num1 < num2 ? helperRecursion(num1,num2-num1,++steps) : helperRecursion(num1-num2,num2,++steps);
    }
}
