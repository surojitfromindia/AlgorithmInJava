package org.surojit.cses;

public class IncreasingArray {
    public static long solverFor(long[] array){
        long lasElement =  array[0];
        long inc = 0;
        for(int j = 1; j <array.length;j+=1 ){
            // store the difference between this element and lastElement
            long currentElement = array[j];
            if(currentElement < lasElement){
                // if the current element is smaller than the previous/last element,
                // we increase 'inc' by the amount that we need to add to this current number
                // that will make it equal with the previous/last element
                long ndiff =  lasElement - currentElement;
                inc+=ndiff;
                // also store this updated(increased) current element as lastElement for the next round.
                lasElement = currentElement+ndiff;

            }else{
                lasElement = currentElement;
            }

        }

        return inc;
    }
}
