package org.surojit.Alog.Sorting;

public class BubbleSort {
    private final int[] array;

    public BubbleSort(int[] array){
        this.array = array;
    }

    public int[] sort(){
        int repeatUntil = array.length-1;
        for(int i = 0;i<repeatUntil; i++){
            for(int j = 0; j< repeatUntil-i;j++){
                if(array[j]> array[j+1]){
                    // we swap them
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j]= temp;
                }
            }
        }
        return  array;
    }

    public int[] sortOptimised(){
        boolean swappedHappened = false;
        int repeatUntil = array.length-1;
        for(int i = 0;i<repeatUntil; i++){
            for(int j = 0; j< repeatUntil-i;j++){
                if(array[j]> array[j+1]){
                    // we swap them
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j]= temp;
                    swappedHappened=true;
                }
            }
            if (!swappedHappened){
                break;
            }
        }
        return  array;
    }
}
