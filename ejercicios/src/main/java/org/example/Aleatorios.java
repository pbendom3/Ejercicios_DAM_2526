package org.example;

import java.util.Random;

public class Aleatorios {

    static void main() {

        Random aleatorio = new Random();

//        int numero = aleatorio.nextInt(5)+5;
//        int numero2 = aleatorio.nextInt(9,10);
//        System.out.println(numero2);
//
//        int numero3 = (int) (aleatorio.nextDouble()*100 +1) ;
//        System.out.println(numero3);
//
//        double numero4 = Math.random()*100 + 1 ;
//        System.out.println(numero4);

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String contrasenya = "";

        for (int i=0;i<12;i++){
            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }

        System.out.println(contrasenya);






    }
}
