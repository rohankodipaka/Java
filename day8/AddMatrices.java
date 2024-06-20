package com.javacoding.day8;

public class AddMatrices {

    public static int[][] matrixAddition(int[][] matrix1, int[][] matrix2){
        int rows = matrix1.length; // no. of rows
        int cols = matrix1[0].length; //  no. of columns in the first row

        int[][] result = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
               result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},
                            {3,4,5}};
        int[][] matrix2 = {{5,6,1},
                            {7,8,9}};

        int[][] result = matrixAddition(matrix1, matrix2);

        for(int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
