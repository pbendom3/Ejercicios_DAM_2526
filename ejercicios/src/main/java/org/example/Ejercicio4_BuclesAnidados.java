package org.example;

import java.util.Scanner;

public class Ejercicio4_BuclesAnidados {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce número máximo de m: ");
        int m = teclado.nextInt();

        primos:
        for (int i=2;i<=m;i++){

            for (int j=2;j<i;j++){

                if (i % j == 0){
                    continue primos;
                }

            }

            System.out.print(i + " ");

        }






    }
}
