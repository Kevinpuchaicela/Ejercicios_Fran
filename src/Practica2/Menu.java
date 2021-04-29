package Practica2;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Qué deseas hacer?");
        System.out.println("1: Imprimir 5 números en orden");
        System.out.println("1: Imprimir 5 números en orden inverso");
        int eleccion = sc.nextInt();
        sc.nextLine();
        while (eleccion != 0) {
            switch (eleccion) {
                case 1 -> metodoA();
                case 2 -> metodoB();
                case 3 -> metodoC();

            }

        }
    }

    public static void metodoA() {
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

    public static void metodoB() {
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

    public static void metodoC() {
        int[] numeros = new int[5];
        int sumaNumerosPositivos = 0;
        int sumaNumerosNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Escribe el número: ");
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros) {
            if (numero > 0) {
                sumaNumerosPositivos += numero;
                cantidadPositivos++;
            } else {
                sumaNumerosNegativos += numero;
                cantidadNegativos++;
            }
        }

        int mediaPositivos = sumaNumerosPositivos / cantidadPositivos;
        int mediaNegativos = sumaNumerosNegativos / cantidadNegativos;

        System.out.println("La media de los números positivos es: " + mediaPositivos);
        System.out.println("La media de los números negativos es: " + mediaNegativos);
    }
}