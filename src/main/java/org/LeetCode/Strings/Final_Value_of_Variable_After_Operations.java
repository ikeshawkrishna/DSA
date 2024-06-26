package org.LeetCode.Strings;

// 2011. Final Value of Variable After Performing Operations
public class Final_Value_of_Variable_After_Operations {

    public static void main(String[] args) {
        String[] str = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(str));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].contains("++")){
                value++;
            } else {
                value--;
            }
        }
        return value;
    }
}
