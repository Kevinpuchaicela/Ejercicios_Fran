package Ejercicio_Basicos_2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("mínimo: ");
        int min = sc.nextInt();
        System.out.print("máximo: ");
        int max = sc.nextInt();

        int result = (int) ((Math.random() * (max - min)) + min);

        System.out.println("numero random: "+ result);

    }
}
