package com.dev.saurabh.array;

/**
 * Created by ssaurab on 2/8/14.
 */
public class MinimumNumberOfJumpsToReachEnd {

    public static void main(String [] args){

        int [] input = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Minimum number of jumps required : " + getMinJumps(input));
    }

    private static int getMinJumps(int[] input) {
        int [] jumps = new int[input.length];
        jumps[input.length-1] = 0; //0 jump required to reach nth position from nth position

        for(int i = input.length-2; i>=0; i--){
            if(input[i] == 0){
                jumps[i] = Integer.MAX_VALUE;
            }
            else if(input[i] >= input.length-i-1){
                jumps[i] = 1;
            }
            else {
                int min = Integer.MAX_VALUE;

                for(int j=i+1; j<input.length && j<=input[i]+i; j++){
                    if(min > jumps[j]){
                        min = jumps[j];
                    }
                    if(min != Integer.MAX_VALUE){
                        jumps[i] = min + 1;
                    }
                    else{
                        jumps[i] = min;
                    }
                }
            }
        }

        return jumps[0];
    }
}
