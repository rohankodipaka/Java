package com.javacoding.arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},
                            {4,5,6}}; //rows*cols = 2*3
        int[][] matrix2 = {{7,8},
                            {9,10},
                            {11,12}}; //rows*cols = 3*2

        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int[][] result = new int[rows][cols]; //rows*cols = rows in matrix1 * cols in matrix2 --> 2*2

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int sum = 0;
                for(int k=0; k<matrix1[0].length; k++){
                    // in matrix1 i remains same w.r.t row but k pointer changes w.r.t column so -> matrix1[i][k].
                    // in matrix2 k pointer remains same w.r.t column but j changes w.r.t row so -> matrix2[k][j].
                    sum = sum + matrix1[i][k]*matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }

        for(int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
