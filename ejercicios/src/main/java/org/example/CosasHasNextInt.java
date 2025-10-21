package org.example;

import java.util.Scanner;

public class CosasHasNextInt {

    static void main() {

//        Scanner teclado = new Scanner(System.in);
//
//        if (teclado.hasNextInt()){
//            int numero = teclado.nextInt();
//            System.out.println(numero);
//        }else{
//            System.out.println("Formato incorrecto. No es un número.");
//        }

        int numero = 1;
        int caracter = 6;
        String palabra = "Patricia";

        switch(caracter){

            case 1:
                System.out.println("Lunes");
            case 2:
                System.out.println("Martes");
            case 3:
                System.out.println("Miércoles");
                System.out.println("Entre semana");
                break;
            case 6:
                System.out.println("Sábado");
            case 7:
                System.out.println("Domingo");
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("No sé el nombre");
                break;
        }




    }
}
