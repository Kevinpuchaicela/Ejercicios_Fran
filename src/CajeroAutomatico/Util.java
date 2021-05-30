package CajeroAutomatico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Util {


    public static String hacerPregunta(String enunciado) {
        String valor = " ";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print(enunciado + "  : ");
            valor = br.readLine();
        } catch (IOException ex) {
            System.out.println("Error");
        }
        return valor;
    }

    public static String inicializar() {
        String tx = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try {
            tx = teclado.readLine();
        } catch (Exception e) {
            System.out.append("Entrada errónea");
        }
        return tx;
    }




    public static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
