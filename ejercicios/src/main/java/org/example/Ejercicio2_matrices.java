package org.example;

import java.util.Arrays;

public class Ejercicio2_matrices {

    static void main() {

        int a[][] = {{1,2,3,4},{5,4,6,7},{6,9,10,12}};

        int b[][] = {{12,21,2,1},{50,1,2,3},{19,0,2,4}};

        int m[][] = new int[3][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]>b[i][j]){
                    m[i][j] = a[i][j];
                }else{
                    m[i][j] = b[i][j];
                }
            }
        }

        for (int fila[] : m){
            System.out.println(Arrays.toString(fila));
        }



    }
}
