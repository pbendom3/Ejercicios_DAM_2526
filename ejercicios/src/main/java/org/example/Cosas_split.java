package org.example;

import java.util.Arrays;

public class Cosas_split {

    static void main() {

        String cadena = "2 3 4 5 3 2 5 4";

        String profesores[] = cadena.split(" ");

        System.out.println(Arrays.toString(profesores));

        int vector[] = new int[profesores.length];

        for (int i=0;i< profesores.length;i++){

            vector[i] = Integer.parseInt(profesores[i]);

        }

        
    }
}
