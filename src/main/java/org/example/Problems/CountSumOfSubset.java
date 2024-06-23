package org.example.Problems;

public class CountSumOfSubset {
    public static void main(String[] args) {
        int[] arr = {2,10,20,23,15,5};
        int sum = 25;

        //countSubsetSum1(arr,sum);
        System.out.println(countSubsetSum(arr,sum,0));
    }


    public static int countSubsetSum(int[] arr, int sum,int i){
        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(i == arr.length){
            return 0;
        }

        return countSubsetSum(arr,sum - arr[i],i+1) + countSubsetSum(arr,sum,i+1);
    }

    //O(n2) complexity
    public static void countSubsetSum1(int[] arr, int sum){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] + arr[j] == sum){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
