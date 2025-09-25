package org.example;
import java.util.Scanner;

public class Actividad {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?: ");
        String nombre = teclado.nextLine();

        System.out.println("¿A qué curso vas?: ");
        String curso = teclado.next();

        System.out.println("Hola " + nombre + " bienvenid@ al curso " + curso);

        System.out.println("Introduce un número...");
        long num1 = teclado.nextLong();

        System.out.println("Introduce otro número...");
        long num2 = teclado.nextLong();

        // opción 1
        System.out.println("El resultado es " + (num1+num2));

        //opción 2
        long resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);






    }
}
