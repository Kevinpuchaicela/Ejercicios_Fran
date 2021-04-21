package Ejercicio_Basicos_2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day.toLowerCase()) {
            case "lunes", "martes", "miercoles", "jueves", "viernes" -> System.out.println("Es laboral");
            case "sabado", "domingo" -> System.out.println("No es laboral");
            default -> System.out.println("Introduce un dia de la semana");
        }
    }
}
