package com.dev.saurabh.array;

import java.util.Arrays;

/**
 * Created by ssaurab on 2/8/14.
 */
public class MaxSumSubsequence {

    public static void main(String [] args){

        int [] input = {1, 101, 2, 3, 100, 4, 5};
        System.out.println("Maximum sum sub-sequence is : " + getMaxSumSubSequence(input));
    }

    private static int getMaxSumSubSequence(int[] input) {
        int [] maxSSS = Arrays.copyOf(input, input.length);
        int max = Integer.MIN_VALUE;

        for(int i=1; i<maxSSS.length; i++){
            for(int j=0; j<i; j++){
                if(input[i] > input[j] && maxSSS[i] < maxSSS[j]+input[i]){
                    maxSSS[i] = maxSSS[j] + input[i];
                    max = Math.max(max, maxSSS[i]);
                }
            }
        }
        return max;
    }

}
