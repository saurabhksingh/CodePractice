package com.dev.saurabh.array;

import java.util.Arrays;

/**
 * Created by ssaurab on 2/8/14.
 */
public class LIS {

    public static void main(String [] args){

        int [] input = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Length of longest increasing sub-sequence is : " + getLIS(input));
    }

    private static int getLIS(int[] input) {
        int [] lis = new int[input.length];
        Arrays.fill(lis, 1);

        int max = Integer.MIN_VALUE;

        for(int i=1; i<input.length; i++){
            for(int j=0; j<i; j++){
                if(input[i] > input[j] && lis[i] < lis[j]+1){
                    lis[i] = lis[j] + 1;
                    max = Math.max(max, lis[i]);
                }
            }
        }

        return max;
    }
}
