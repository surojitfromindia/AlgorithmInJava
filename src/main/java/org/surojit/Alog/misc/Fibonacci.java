package org.surojit.Alog.misc;

public class Fibonacci {
    public static int generate(int upTo){
        int n1 = 1;
        int n2 = 1;
        // need to calculate n3 = n2 + n1
        int currentIndex = 2;
        while (currentIndex<upTo){
            int n3 = n2 + n1;
            n1= n2;
            n2= n3;
            currentIndex++;
        }
        return n2;
    }
}
