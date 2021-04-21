package Ejercicio_Basicos_2;

public class Ejercicio6 {
    public static void main(String[] args) {
        final int MAX = 100;

        for (int i = 1; i <= 100; i++) {
            if(i%2==0 && i%3==0){
                System.out.println(i +" es divisible entre 2 y 3");
            }
        }
    }
}
