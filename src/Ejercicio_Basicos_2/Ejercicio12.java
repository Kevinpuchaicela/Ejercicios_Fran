package Ejercicio_Basicos_2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num = sc.nextInt();
        int cifras = String.valueOf(num).length(); //lo convertimos a string para sacar la longitud
        System.out.println(num + " tiene: "+ cifras + " cifras.");
    }
}
