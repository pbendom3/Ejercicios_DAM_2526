package org.example;

import java.util.Scanner;

public class EjerciciosBucles {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        //1
        String buena = "admin1234";

        do{
            System.out.println("Introduce tu contraseña: ");
            String contrasenya = teclado.next();

            if (contrasenya.equals(buena)){
                break;
            }

        }while(true);

        // 2
        int n = teclado.nextInt();

        for (int i=n;i>0;i--){
            System.out.println(i);
        }

        //3
        for(int i=1;i<=50;i++){

            if (i % 3 !=0){
                continue;
            }
            System.out.println(i);
        }

        // 7
        System.out.println("Introduce una palabra...");
        String palabra = teclado.next();
        int letras = palabra.length();
        for (int i=letras-1;i>=0;i--){
            System.out.print(palabra.charAt(i));
        }




    }
}
