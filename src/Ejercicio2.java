import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        char letra = sc.next().charAt(0);
        System.out.println((int) +letra);
    }

}
