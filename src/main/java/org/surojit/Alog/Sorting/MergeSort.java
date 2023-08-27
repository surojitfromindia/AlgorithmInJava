package org.surojit.Alog.Sorting;

import java.util.Arrays;

public class MergeSort {

    private final int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }
    public int[] sort() {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    void merge(int[] mergedArray, int start, int middle, int end) {
        int[] leftSortedArray = Arrays.copyOfRange(mergedArray, start, middle + 1);
        int[] rightSortedArray = Arrays.copyOfRange(mergedArray, middle + 1, end + 1);
        int lAL = leftSortedArray.length;
        int rAL = rightSortedArray.length;
        int leftPointer = 0;
        int rightPointer = 0;
        int mergePointer = start; // an in place update required this to be start at correct position
        while (leftPointer < lAL && rightPointer < rAL) {
            if (leftSortedArray[leftPointer] < rightSortedArray[rightPointer]) {
                mergedArray[mergePointer] = leftSortedArray[leftPointer];
                leftPointer++;
            } else {
                mergedArray[mergePointer] = rightSortedArray[rightPointer];
                rightPointer++;
            }
            mergePointer++;
        }
        // copy the rest of the leftSortedArray
        while (leftPointer < lAL) {
            mergedArray[mergePointer] = leftSortedArray[leftPointer];
            leftPointer++;
            mergePointer++;
        }

        while (rightPointer < rAL) {
            mergedArray[mergePointer] = rightSortedArray[rightPointer];
            rightPointer++;
            mergePointer++;
        }
    }

    void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(a, start, middle);
            mergeSort(a, middle + 1, end);
            merge(a, start, middle, end);

        }

    }


}
