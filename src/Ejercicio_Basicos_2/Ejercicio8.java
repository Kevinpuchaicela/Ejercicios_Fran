package Ejercicio_Basicos_2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un número mayor o igual a 0: ");
            num = sc.nextInt();
        } while (!(num >= 0));

        System.out.println("FIN DEL PROGRAMA");
    }
}
