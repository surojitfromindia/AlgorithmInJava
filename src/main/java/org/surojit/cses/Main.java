package org.surojit.cses;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] nm = new long[n];
        int j = 0;
        while (j<n){
            nm[j] = scanner.nextLong();
            j+=1;
        }


    }
}
