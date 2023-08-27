package org.surojit.Alog.Sorting;

public class QuickSort {
    private final int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public int[] sort(){
        quickSort(0, array.length-1);
        return array;
    }
    void quickSort(int low, int high){
        if(low<high){
            int partitionPosition = partitionReturnPivotPos(low,high);
            quickSort(low,partitionPosition);
            quickSort(partitionPosition+1,high);
        }

    }

     int partitionReturnPivotPos(int low, int high) {
        int pivot = array[low]; // i take first element as pivot
        int forwardPointer = low;
        int backwardPointer = high;
        while (forwardPointer < backwardPointer) {
            // comparing with forwardPointer
            // increment forwardPointer until an element greater than pivot is found
            while (array[forwardPointer] <= pivot) {
                forwardPointer++;
            }
            // decrease until smaller or equal number than pivot is found
            while (array[backwardPointer] > pivot) {
                backwardPointer--;
            }
            if (forwardPointer < backwardPointer) {
                int temp = array[forwardPointer];
                array[forwardPointer] = array[backwardPointer];
                array[backwardPointer] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[backwardPointer];
        array[backwardPointer] = temp;
        return backwardPointer;

    }
}
