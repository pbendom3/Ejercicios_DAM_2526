package org.example;

public class Ejercicio4_2 {

    static void main() {

        String texto = "Hola Mundo, bienvenido Mundo a Mundo Mundo Mundo. Mundo es genial.";
        String palabra = "Mundo";

        int texto_tamnyo = texto.length();
        int palabra_tamnyo = palabra.length();

        String frase_sin = texto.replace(palabra,"");
        int conteo = frase_sin.length();
        int resta = texto_tamnyo - conteo;
        int resultado = resta  / palabra_tamnyo;
        System.out.println(resultado);

        boolean esta = texto.contains("albaricoque");
        System.out.println(esta);


    }
}
