package org.example;

import java.util.Arrays;

public class Prueba {

    static void main() {

        int vector[] = {2,3,5,1,6};

        System.out.println(Arrays.toString(vector));
        int aux=0;

        aux = vector[vector.length-1];

        for (int i=1;i< vector.length-1;i++){
                vector[i+1]=vector[i];
        }

        vector[0]=aux;

        System.out.println(Arrays.toString(vector));
        System.out.println(aux);

    }
}
