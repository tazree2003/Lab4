
package com.mycompany.question2;


public class MatrixMultiplication {
    // Function to multiply two matrices
    public static Matrix multiplyMatrices(Matrix firstMatrix, Matrix secondMatrix) {
        int r1 = firstMatrix.getRows();
        int c1 = firstMatrix.getColumns();
        int r2 = secondMatrix.getRows();
        int c2 = secondMatrix.getColumns();

        if (c1 != r2) {
            throw new IllegalArgumentException("Matrices cannot be multiplied: columns of first matrix must equal rows of second matrix.");
        }

        Matrix product = new Matrix(r1, c2);
        int[][] first = firstMatrix.getMatrix();
        int[][] second = secondMatrix.getMatrix();

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product.setElement(i, j, product.getMatrix()[i][j] + first[i][k] * second[k][j]);
                }
            }
        }
        return product;
    }
    
}
