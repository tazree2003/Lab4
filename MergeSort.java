package com.mycompany.question1;

public class MergeSort {
     public void sort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            // Split left part
            int[] left = new int[mid];
            System.arraycopy(arr, 0, left, 0, mid);

            // Split right part
            int[] right = new int[arr.length - mid];
            System.arraycopy(arr, mid, right, 0, arr.length - mid);

            sort(left);
            sort(right);

            // Merge left and right arrays
            merge(arr, left, right);
        }
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = 0;

        // Merge the left and right arrays
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                arr[mergedIndex++] = left[leftIndex++];
            } else {
                arr[mergedIndex++] = right[rightIndex++];
            }
        }

        // Collect remaining elements
        while (leftIndex < left.length) {
            arr[mergedIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            arr[mergedIndex++] = right[rightIndex++];
        }
    }
    
}
