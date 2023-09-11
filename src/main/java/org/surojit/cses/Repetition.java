package org.surojit.cses;

public class Repetition {
    public static long solveFor(String dna){
        long h = 1;
        long c = 1;
        char lastVisited =  dna.charAt(0);
        for(int j = 1; j <dna.length(); j+=1){
            // 1. if last visited and current are same, then increase c by 1
            //    else reset set h as c if c > h and c = 1
            char current = dna.charAt(j);

            if(current==lastVisited){
                c+=1;
                if(c>h){
                    h= c;
                }
            }
            else{
                lastVisited = current;
                c = 1;
            }


        }

        return h;
    }
}
