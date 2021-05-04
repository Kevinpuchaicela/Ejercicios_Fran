package Practica2;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean continuar = true;
        while (continuar) {
            System.out.println("Qué deseas hacer?");
            System.out.println("1: Imprimir 5 números en orden");
            System.out.println("2: Imprimir 5 números en orden inverso");
            System.out.println("3: Calcular la media de numeros positivos y negativos.");
            System.out.println("4: Imprimir la cantidad de carácteres dado un texto");
            System.out.println("5: Imprimir texto invertido");
            System.out.println("6: Imprimir texto sin espacios");
            System.out.println("7: Concatenar 2 cadenas");
            System.out.println("8: Sustituir vocales de un texto");
            System.out.println("9: Imprimir código ASCII de un texto");
            System.out.print("Escoge una opción: ");
            int eleccion = sc.nextInt();
            if (eleccion > 0 && eleccion < 10) {
                switch (eleccion) {
                    case 1 -> imprimir5numeros();
                    case 2 -> imprimirNumerosInvertido();
                    case 3 -> imprimirMediaNumeros();
                    case 4 -> {
                        System.out.print("Introduce un texto: ");
                        sc.nextLine();
                        String texto = sc.nextLine();
                        imprimirCantidadDeCaracteres(texto);
                    }
                    case 5 -> {
                        System.out.print("Introduce un texto: ");
                        sc.nextLine();
                        String texto = sc.nextLine();
                        imprimirTextoInvertido(texto);
                    }
                    case 6 -> {
                        System.out.print("Introduce un texto: ");
                        sc.nextLine();
                        String texto = sc.nextLine();
                        imprimirTextoSinEspacios(texto);
                    }
                    case 7 -> {
                        System.out.print("Introduce el primer texto: ");
                        sc.nextLine();
                        String texto1 = sc.nextLine();
                        System.out.print("Introduce el segundo texto: ");
                        String texto2 = sc.nextLine();
                        concatenar2cadenas(texto1, texto2);
                    }
                    case 8 -> {
                        System.out.print("Introduce el texto: ");
                        sc.nextLine();
                        String texto1 = sc.nextLine();
                        System.out.print("Introduce la vocal: ");
                        String texto2 = sc.nextLine();
                        sustituirVocales(texto1, texto2);
                    }
                    case 9 -> {
                        System.out.print("Introduce el texto: ");
                        sc.nextLine();
                        String texto = sc.nextLine();
                        imprimirCodigoAscii(texto);
                    }

                }
                System.out.println("--------------------------");
            } else {
                System.out.println("Saliendo del programa...");
                continuar = false;
            }

        }
    }

    public static void imprimir5numeros() {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Escribe el número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.print("Numeros introducidos en orden: ");
        for (int num : numeros) {
            System.out.print(num + ", ");
        }
    }

    public static void imprimirNumerosInvertido() {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Escribe el número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.print("Numeros introducidos en orden inverso: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + ", ");
        }
    }

    public static void imprimirMediaNumeros() {
        int[] numeros = new int[5];
        int sumaNumerosPositivos = 0;
        int sumaNumerosNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Escribe el número: ");
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros) {
            if (numero > 0) {
                sumaNumerosPositivos += numero;
                cantidadPositivos++;
            } else if (numero == 0) {
                cantidadCeros++;
            } else {
                sumaNumerosNegativos += numero;
                cantidadNegativos++;
            }
        }

        int mediaPositivos = sumaNumerosPositivos / cantidadPositivos;
        int mediaNegativos = sumaNumerosNegativos / cantidadNegativos;

        System.out.println("La media de los números positivos es: " + mediaPositivos);
        System.out.println("La media de los números negativos es: " + mediaNegativos);
        System.out.println("La cantidad de ceros es: " + cantidadCeros);
    }

    public static void imprimirCantidadDeCaracteres(String texto) {
        int cantidadCaracteres = texto.replace(" ", "").length();
        System.out.println("Cantidad de carácteres: " + cantidadCaracteres);
    }

    public static void imprimirTextoInvertido(String texto) {
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        System.out.println("Texto invertido: " + textoInvertido);
    }

    public static void imprimirTextoSinEspacios(String texto) {
        String textoSinEspacios = texto.replace(" ", "");
        System.out.println("Texto invertido: " + textoSinEspacios);

    }

    public static void concatenar2cadenas(String texto1, String texto2) {
        System.out.println("Texto concatenado: " + texto1 + texto2);
    }

    public static void sustituirVocales(String cadena, String vocal) {
        String cadenaConVocalesCambiadas = cadena.replaceAll("[aeiouAEIOU]", vocal);
        System.out.println("Texto con vocales cambiadas: " + cadenaConVocalesCambiadas);

    }

    public static void imprimirCodigoAscii(String cadena) {
        for (char caracter : cadena.toCharArray()) {
            System.out.println(caracter + " en código ASCII: " + (int) caracter);
        }
    }
}