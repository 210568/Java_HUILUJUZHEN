package com.company;

import java.util.*;

public class Main {

    final static int ARRAY_MAX = 100;
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int i,j,k,p,q;
        int [][] array = new int[ARRAY_MAX][ARRAY_MAX];
        int count = 0;
        p = 0;
        q = n-1;
        while(count < n * n){
            for (i=p;i<=q;i++){
                array[p][i] = ++count;
            }
            for (i=p+1;i<=q;i++) {
                array[i][q] = ++count;
            }
            for (i=q-1;i>=p;i--) {
                array[q][i] = ++count;
            }
            for (i=q-1;i>=p+1;i--) {
                array[i][p] = ++count;
            }
            ++p;
            --q;
        }
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
