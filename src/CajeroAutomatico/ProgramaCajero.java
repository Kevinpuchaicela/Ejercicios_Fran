package CajeroAutomatico;

import java.util.Scanner;

public class ProgramaCajero {
    public static void main(String[] args) {
        int[][] carga_billetes = {{500, 1}, {200, 3}, {100, 0}, {50, 0}, {20, 0}, {10, 18}, {5, 25}};
        Scanner sc = new Scanner(System.in);
        CajeroAutomatico micajero = new CajeroAutomatico();
        int opcionSeleccionada;
        int efectivoSolicitado = 0;
        boolean continuar = true;
        String NIF;
        int PIN;

        TarjetaDebito mitarj1 = new TarjetaDebito("12345678a", 1111, "Fran", "Fran", 2000);
        TarjetaCredito mitarj2 = new TarjetaCredito("87654321b", 2222, "Javi", "Javi", 10, 1000);

        micajero.setBilletes(carga_billetes);
        micajero.getListaTarjetas().add(mitarj1);
        micajero.getListaTarjetas().add(mitarj2);
        while (continuar) {

            micajero.getListaTarjetas().forEach(tarjeta -> tarjeta.mostrarTarjeta());
            micajero.mostrarCajero();
            mostrarMenu();
            System.out.print("Escribe una de las opciones: ");
            opcionSeleccionada = sc.nextInt();
            System.out.println("Has seleccionado la opcion: " + opcionSeleccionada);

            if (opcionSeleccionada == 1) {
                System.out.print("Dame el NIF: ");
                sc.nextLine();
                NIF = sc.nextLine();
                System.out.print("Dame el PIN: ");
                PIN = sc.nextInt();
                Tarjeta tarjetaOperando = micajero.comprobarDatos(NIF, PIN);
                if (!(tarjetaOperando == null)) {
                    System.out.print("Que cantidad deseas sacar?: ");
                    efectivoSolicitado = sc.nextInt();
                    if (efectivoSolicitado <= micajero.cantidadDineroCajero()) {
                        if (tarjetaOperando instanceof TarjetaCredito) {
                            micajero.sacarDineroCredito(tarjetaOperando, efectivoSolicitado);
                        } else {
                            micajero.sacarDineroDebito(tarjetaOperando, efectivoSolicitado);
                        }
                    } else {
                        System.out.println("No tenemos dinero en efectivo para la cantidad solicitada.");
                    }

                }
            } else {
                continuar = false;
            }

        }
        System.out.println("Hasta pronto!");


    }

    public static void mostrarMenu() {
        System.out.println("============================");
        System.out.println("-----------MENÚ-------------");
        System.out.println("1. Opcion 1 - Sacar Dinero");
        System.out.println("2. Opcion 2 - Salir");
        System.out.println("----------------------------");
        System.out.println("============================");
    }


}

