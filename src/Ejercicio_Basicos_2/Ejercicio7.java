package Ejercicio_Basicos_2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("Cuantos productos has vendido?: ");
        int products = sc.nextInt();

        for (int i = 1; i <= products; i++) {
            System.out.print("Precio de producto nº" + i + ": ");
            int price = sc.nextInt();
            total = total + price;
        }

        System.out.println("Precio total: " + total);
    }
}
