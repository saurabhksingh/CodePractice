package com.dev.saurabh.array;

/**
 * Created by ssaurab on 2/8/14.
 */
public class ArrayUtil {

    public static int [] getRandomBinaryArray(int len){
        int [] result = new int[len];
        for(int i=0; i<len; i++){
            result[i] = (int)(Math.random() + 0.5);
        }

        return result;
    }

    public static void displayArray(int [] input){
        for(int i : input){
            System.out.print(i);System.out.print(" ");
        }
    }
}
