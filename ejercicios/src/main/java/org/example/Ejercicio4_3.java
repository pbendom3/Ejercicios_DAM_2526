package org.example;

import java.util.Arrays;

public class Ejercicio4_3 {

    static void main() {

        int vector[] = {2,3,5,1,6};

        int filtrado[] = new int[vector.length-1];

        int borrar =2;

        for (int i=0;i< filtrado.length;i++){

            if (i>=borrar){
                filtrado[i]=vector[i+1];
            }else{
                filtrado[i]=vector[i];
            }

        }

        System.out.println(Arrays.toString(filtrado));


    }


}
