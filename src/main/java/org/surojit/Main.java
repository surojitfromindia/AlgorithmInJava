package org.surojit;

import org.surojit.Alog.Sorting.*;
import org.surojit.DataStructure.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {52, 37, 63, 14, 17, 6, 8, 2};

        System.out.println("Bubble sort");
        BubbleSort bubbleSort = new BubbleSort(unsortedArray);
        System.out.println("normal>" + Arrays.toString(bubbleSort.sort()));
        System.out.println("optimised>" + Arrays.toString(bubbleSort.sortOptimised()));

        System.out.println("Selection sort");
        SelectionSort selectionSort = new SelectionSort(unsortedArray);
        System.out.println("normal>" + Arrays.toString(selectionSort.sort()));

        System.out.println("Insert sort");
        InsertionSort insertionSort = new InsertionSort(unsortedArray);
        System.out.println("normal>" + Arrays.toString(insertionSort.sort()));

        System.out.println("Merge sort");
        MergeSort mergeSort = new MergeSort(unsortedArray);
        System.out.println("normal>"+Arrays.toString(mergeSort.sort()));

        System.out.println("Quick sort");
        QuickSort quickSort = new QuickSort(unsortedArray);
        System.out.println("normal>"+Arrays.toString(quickSort.sort()));


        System.out.println("Linked list");
        LinkedList linkedList = new LinkedList(12);
        linkedList.addNodeAtEnd(32);
        linkedList.addNodeAtFront(9);
        linkedList.display();
        linkedList.delete();
        linkedList.display();
    }
}