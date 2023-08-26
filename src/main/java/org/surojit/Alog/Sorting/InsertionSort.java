package org.surojit.Alog.Sorting;

public class InsertionSort {
    private final int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        // we start comparing from the second element
        // and compare it to the element in the left, not on the right
        for (int i = 1; i < array.length - 1; i++) {
            int keyElement = array[i];
            for (int j = i - 1; j >= 0; j--) {
                // if the current element (index j always point element on the left side)
                // is bigger than keyElement, we push forward
                if (array[j] > keyElement) {
                    array[j + 1] = array[j];
                } else {
                    // break the loop if a smaller element is found,
                    // we stop and push the keyElement after it
                    array[j + 1] = keyElement;
                    break;
                }
            }
        }
        return array;
    }


}
