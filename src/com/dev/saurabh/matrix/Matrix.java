package com.dev.saurabh.matrix;

/**
 * Created by ssaurab on 2/7/14.
 */
public class Matrix {

    public static int [][] createRandomBinaryMatrix(int rows, int cols){
        int [][] matrix = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = (int)(Math.random() + 0.5);
            }
        }

        return matrix;
    }


    public static void display(int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j]);System.out.print(" ");
            }
            System.out.println();
        }
    }
}
