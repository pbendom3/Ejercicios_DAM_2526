package org.example;

import java.util.Random;

public class Aleatorios_bis {

    static void main() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(10);
        System.out.println(numero);

        double numero3 = aleatorio.nextDouble()
                ;
        System.out.println(numero3);

        int numero2 = (int) (Math.random()*10+1) ;
        System.out.println(numero2);

    }
}
