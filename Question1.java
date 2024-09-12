
package com.mycompany.question1;

import java.util.Scanner;

public class Question1 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Choose the sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Merge Sort");
        int choice = scanner.nextInt();

       switch (choice) {
            case 1 -> {
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.sort(arr);
             }
            case 2 -> {
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.sort(arr);
             }
            case 3 -> {
                MergeSort mergeSort = new MergeSort();
                mergeSort.sort(arr);
             }
            default -> {
                System.out.println("Invalid choice");
                return;
             }
        }


        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
