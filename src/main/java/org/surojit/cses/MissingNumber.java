package org.surojit.cses;

import java.util.Arrays;

public class MissingNumber {
    public static long solverFor(long[] numbers){
        long v= numbers.length+1;
        long seriesSum = (v*(v+1))/2;
        long totalSum = Arrays.stream(numbers).sum();
        return seriesSum - totalSum;
    }
}
