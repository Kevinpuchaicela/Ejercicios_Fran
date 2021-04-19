import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final double IVA = 0.21;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        double num = sc.nextDouble();
        double result = num + (num * IVA);
        System.out.println(result);
    }
}
