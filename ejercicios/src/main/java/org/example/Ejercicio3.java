package org.example;

import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número...");
        int numero = teclado.nextInt();

        if (numero==0){
            System.out.printf("El número " + numero + " es natural");
        }else{
            if (numero>0){
                System.out.printf("El número " + numero + " es positivo");
            }else{
                System.out.printf("El número " + numero + " es negativo");
            }
        }

//        if (numero==0){
//            System.out.printf("El número " + numero + " es natural");
//        } else if (numero>0) {
//                System.out.printf("El número " + numero + " es positivo");
//        }else{
//            System.out.printf("El número " + numero + " es negativo");
//        }



    }
}
