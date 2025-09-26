package org.example;

import java.util.Scanner;

public class Ejercicio1_2 {

    static void main() {

        final double JORNADA = 40;
        final double PLUS_EXTRA = 1.5;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas: ");
        double horas = teclado.nextDouble();
        System.out.println("Introduce la tarifa por hora: ");
        double tarifa = teclado.nextDouble();

        if (horas>JORNADA){//si

            double extra = horas - JORNADA; //40
            double tarifa_extra = tarifa * PLUS_EXTRA;
            double salario_extra = extra * tarifa_extra;

            System.out.println("Salario (con extra): " + (salario_extra + JORNADA*tarifa) + "€");

        }else{ // si no - Ejercicio1
            double salario = horas * tarifa;
            System.out.println("Salario: " + salario + "€");
        }





    }
}
