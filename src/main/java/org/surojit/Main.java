package org.surojit;

import org.surojit.Alog.Sorting.BubbleSort;
import org.surojit.Alog.Sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {4,76,9,3,22,90,4,65};

        System.out.println("Bubble sort");
        BubbleSort bubbleSort = new BubbleSort(unsortedArray);
        System.out.println("normal>"+Arrays.toString(bubbleSort.sort()));
        System.out.println("optimised>"+Arrays.toString(bubbleSort.sortOptimised()));

        System.out.println("Selection sort");
        SelectionSort selectionSort = new SelectionSort(unsortedArray);
        System.out.println("normal>"+ Arrays.toString(selectionSort.sort()));
    }
}