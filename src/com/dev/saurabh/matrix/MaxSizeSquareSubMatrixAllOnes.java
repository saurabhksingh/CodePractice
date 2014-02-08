package com.dev.saurabh.matrix;

/**
 * Created by ssaurab on 2/7/14.
 */
public class MaxSizeSquareSubMatrixAllOnes {

    public static void main(String [] args){

        int [][] matrix = Matrix.createRandomBinaryMatrix(5,6);

        System.out.println("Input matrix is :");
        Matrix.display(matrix);
        System.out.println("\noutput is :");
        Matrix.display(getSquareSubMatrix(matrix));
    }

    /**
     * Let the given binary matrix be M[R][C].
     * The idea of the algorithm is to construct an auxiliary size matrix S[][] in
     * which each entry S[i][j] represents size of the square sub-matrix with all 1s
     * including M[i][j] where M[i][j] is the rightmost and bottommost entry in sub-matrix.
     */
    public static int [][] getSquareSubMatrix(int [][] M){
        int [][] S = new int[M.length][M[0].length];
        int max = 0;

        for(int i=0; i<M.length; i++){
            S[i][0] = M[i][0];
            if(S[i][0] > max){
                max = S[i][0];
            }
        }
        for(int i=0; i<M[0].length; i++){
            S[0][i] = M[0][i];
            if(S[0][i] > max){
                max = S[0][i];
            }
        }

        for(int i=1; i<M.length; i++){
            for(int j=1; j<M[0].length; j++){
                if(M[i][j] == 1){
                    S[i][j] = Math.min(S[i-1][j-1], Math.min(S[i][j-1], S[i-1][j])) + 1;
                    if(S[i][j] > max){
                        max = S[i][j];
                    }
                }
                else{
                    S[i][j] = 0;
                }
            }
        }


        int [][] result = new int[max][max];

        for(int i=0; i< max; i++){
            for(int j=0; j< max; j++){
                result[i][j] = 1;
            }
        }

        return result;

    }
}
