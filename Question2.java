
package com.mycompany.question2;

import java.util.Scanner;


public class Question2 {
    
    public static void main(String[] args) {
        // Input dimensions of the first matrix
        try (Scanner scanner = new Scanner(System.in)) {
            // Input dimensions of the first matrix
            System.out.println("Enter the number of rows and columns of the first matrix:");
            int r1 = scanner.nextInt();
            int c1 = scanner.nextInt();
            
            // Input dimensions of the second matrix
            System.out.println("Enter the number of rows and columns of the second matrix:");
            int r2 = scanner.nextInt();
            int c2 = scanner.nextInt();
            
            // Check if multiplication is possible
            if (c1 != r2) {
                System.out.println("Matrices cannot be multiplied. The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
                return;
            }
            
            // Input elements of the first matrix
            Matrix firstMatrix = new Matrix(r1, c1);
            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    firstMatrix.setElement(i, j, scanner.nextInt());
                }
            }
            
            // Input elements of the second matrix
            Matrix secondMatrix = new Matrix(r2, c2);
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    secondMatrix.setElement(i, j, scanner.nextInt());
                }
            }
            
            // Multiply the matrices
            Matrix product = MatrixMultiplication.multiplyMatrices(firstMatrix, secondMatrix);
            
            // Print the result
            System.out.println("Product of the matrices:");
            product.printMatrix();
        }
    }
     
}
