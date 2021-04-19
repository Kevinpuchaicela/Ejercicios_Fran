import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        final String passwordSytem = "feliz2021@";
        int attempts = 3;
        Scanner sc = new Scanner(System.in);
        while (attempts > 0) {
            System.out.print("Contraseña: ");
            String inputUserPassword = sc.nextLine();
            if (inputUserPassword.equals(passwordSytem)) {
                System.out.println("Enhorabuena, contraseña correcta.");
                break;
            } else {
                if (attempts - 1 == 0) {
                    System.out.println("No tienes más intentos. Cuenta bloqueada");
                    break;
                } else {
                    attempts--;

                }
            }
        }


    }
}
