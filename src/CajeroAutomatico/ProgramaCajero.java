package CajeroAutomatico;

import java.util.Scanner;

public class ProgramaCajero {
    public static void main(String[] args) {
        CajeroAutomatico micajero = new CajeroAutomatico();
        boolean continuar = true;

        micajero.inicializarDatosCajero();

        while (continuar) {

            micajero.getListaTarjetas().forEach(tarjeta -> tarjeta.mostrarTarjeta());
            micajero.mostrarCajero();
            mostrarMenu();

            String opcionSeleccionada = Util.hacerPregunta("Escribe una de las opciones");
            while (!Util.esNumero(opcionSeleccionada) || !((Integer.parseInt(opcionSeleccionada) >= 1) && (Integer.parseInt(opcionSeleccionada) <= 2))) {
                System.out.println("Selecciona una de las opciones!");
                opcionSeleccionada = Util.hacerPregunta("Escribe una de las opciones");
            }

            System.out.println("Has seleccionado la opcion: " + opcionSeleccionada);

            if (opcionSeleccionada.equals("1")) {

                String NIF = Util.hacerPregunta("Dame el NIF");
                String PIN = Util.hacerPregunta("Dame el PIN");

                while (!Util.esNumero(PIN)) {
                    System.out.println("Introduce números!!");
                    PIN = Util.hacerPregunta("Dame el PIN");
                }

                Tarjeta tarjetaOperando = micajero.comprobarDatos(NIF, Integer.parseInt(PIN));

                if (!(tarjetaOperando == null)) { // Comprobamos si la tarjeta es correcta
                    String efectivoSolicitado = Util.hacerPregunta("Que cantidad desear sacar?");
                    while (!Util.esNumero(efectivoSolicitado)) {
                        efectivoSolicitado = Util.hacerPregunta("Que cantidad desear sacar?");
                    }

                    if (Integer.parseInt(efectivoSolicitado) <= micajero.cantidadDineroCajero()) {// Comprobamos si hay dinero en el cajero
                        if (tarjetaOperando instanceof TarjetaCredito) {// instancias
                            micajero.sacarDineroCredito(tarjetaOperando, Integer.parseInt(efectivoSolicitado));
                        } else {
                            micajero.sacarDineroDebito(tarjetaOperando, Integer.parseInt(efectivoSolicitado));
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

    private static void mostrarMenu() {
        System.out.println("============================");
        System.out.println("-----------MENÚ-------------");
        System.out.println("1. Opcion 1 - Sacar Dinero");
        System.out.println("2. Opcion 2 - Salir");
        System.out.println("----------------------------");
        System.out.println("============================");
    }

}

