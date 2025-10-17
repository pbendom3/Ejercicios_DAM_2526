package org.example;

import java.util.Scanner;

public class Ejercicio5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int numerador = 0;
        int denominador = 0;

        boolean control = true;

        do {
            try{
                System.out.println("Introduce el numerador...");
                numerador = teclado.nextInt();
                System.out.println("Introduce el denominador...");
                denominador = teclado.nextInt();
                control = false;
            }catch (Exception e){
                System.out.println("El formato no es correcto. Vuelve a introducirlos...");
                control = true;
            }
            //control
            teclado.nextLine();
        }while(control==true);


        int resultado = numerador / denominador;

        System.out.println("El resultado es " + resultado);






    }
}
