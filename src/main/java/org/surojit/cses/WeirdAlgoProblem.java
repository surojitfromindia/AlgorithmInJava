package org.surojit.cses;

public class WeirdAlgoProblem {
    public static void solverFor(long start){
        StringBuilder stringBuilder = new StringBuilder();
        long p = start;
        while (p>1){
            stringBuilder.append(p).append(" ");
            if(p%2==0){
                p = p/2;
            }
            else{
                p = (3*p)+1;
            }
        }
        stringBuilder.append(1);
        System.out.println(stringBuilder);
    }
}

