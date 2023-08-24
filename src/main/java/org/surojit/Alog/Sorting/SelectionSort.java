package org.surojit.Alog.Sorting;

public class SelectionSort {
    private final int[] array;

    public SelectionSort(int[] array){
        this.array = array;
    }
    public int[] sort(){
        // in each iteration, we find the smallest number
        // and place it in front of an unsorted array
        int repeatUntil = array.length;
        for(int i = 0; i< repeatUntil; i++){
            int minElementIndex = i;
            // compare this element with the rest of them
            for(int j = i+1; j< repeatUntil-1;j++){
                if(array[minElementIndex]>array[j]){
                    minElementIndex = j;
                }
            }
            //swap
            int temp = array[minElementIndex];
            array[minElementIndex] = array[i];
            array[i]= temp;
        }
        return array;
    }
}
