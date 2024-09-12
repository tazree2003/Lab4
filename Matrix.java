
package com.mycompany.question2;

public class Matrix {
     private int[][] matrix;
    private int rows;
    private int columns;

    // Constructor
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    // Getters
    public int[][] getMatrix() {
        return matrix;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    // Method to set matrix elements
    public void setElement(int row, int col, int value) {
        this.matrix[row][col] = value;
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
