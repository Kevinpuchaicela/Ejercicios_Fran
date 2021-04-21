package Practica1_Calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {

    public static void mostrarMenu() {
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.println("5: Resto");
        System.out.println("6: Salir del programa");
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double resultado;
        int eleccion;
        boolean continuar = true;
        while (continuar) {
            do {
                System.out.println("--->Calculadora<---");
                mostrarMenu();
                System.out.print("Que operación deseas hacer?: ");
                eleccion = sc.nextInt();
            } while (eleccion < 1 || eleccion > 6);
            if (!(eleccion == 6)) {
                System.out.print("Introduce el primer número: ");
                double num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                double num2 = sc.nextDouble();
                switch (eleccion) {
                    case 1 -> resultado = Algoritmia.sumar(num1, num2);
                    case 2 -> resultado = Algoritmia.restar(num1, num2);
                    case 3 -> resultado = Algoritmia.multiplicar(num1, num2);
                    case 4 -> resultado = Algoritmia.dividir(num1, num2);
                    case 5 -> resultado = Algoritmia.resto(num1, num2);
                    default -> throw new IllegalStateException(eleccion + " no es válido");
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("El resultado es: " + resultado);
                System.out.println("-------------------------------");
                System.out.println("-------------------------------");
                System.out.println(" ");
            } else {
                System.out.println("Saliendo del programa...");
                continuar = false;
            }
        }
    }
}
