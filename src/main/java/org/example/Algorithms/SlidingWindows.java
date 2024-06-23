package org.example.Algorithms;

public class SlidingWindows {

    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int k = 5;
        //slidingWindow1(arr,k);
        slidingWindow(arr,k);
    }

    //O(n) complexity
    private static void slidingWindow(int[] arr,int k) {
        int maxSum = Integer.MAX_VALUE;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
            maxSum = windowSum;
        }
        System.out.println(windowSum);

        for (int i = 1; i <= arr.length - k ; i++) {
            windowSum = windowSum + arr[i+k-1] - arr[i-1];
            maxSum = Integer.max(windowSum,maxSum);
        }
        System.out.println(maxSum);

    }


    //o(n2) complexity
    private static void slidingWindow1(int[] arr,int k) {

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i=0; i <= arr.length-k ;i++){
            int csum = 0;

            for (int j = 0; j < k; j++){
                csum = csum + arr[i+j];
            }

            System.out.println(csum);
            maxSum = Integer.max(maxSum, csum);
            minSum = Integer.min(minSum, csum);
        }

        System.out.println("The Maximum sum is : "+maxSum);
        System.out.println("The Minimum sum is : "+minSum);

    }
}
