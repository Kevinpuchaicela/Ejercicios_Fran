package CajeroAutomatico;

import java.util.ArrayList;
import java.util.List;

public class CajeroAutomatico {
    private int idUltCaj = 0;
    private int idCaj;
    private int[][] billetes;
    private List<Tarjeta> listaTarjetas = new ArrayList<>();


    public CajeroAutomatico() {
        this.idCaj = idUltCaj++;
    }

    public void mostrarCajero() {
        System.out.println("Dinero efectivo en cajero:");
        for (int[] billete : billetes) {
            System.out.print(billete[1] + " billetes de " + billete[0]);
            System.out.println(" ");
        }
    }


    public Tarjeta comprobarDatos(String NIF, int PIN) {
        for (Tarjeta tarjeta : listaTarjetas) {
            if (tarjeta.getNIF().equals(NIF)) {
                if (tarjeta.getPIN() == PIN) {
                    return tarjeta;
                } else {
                    System.out.println("PIN INCORRECTO");
                    break;
                }
            }
        }
        System.out.println("NIF INCORRECTO. No se ha encontrado ningún nif asociado a ese número");

        return null;
    }

    public void sacarDineroCredito(Tarjeta tarjeta, int cantidadParaSacar) {
        System.out.println("==================");
        TarjetaCredito tarjCred = (TarjetaCredito) tarjeta;
        if (!((tarjCred.getCreditoDisponible() + tarjCred.getSaldoDisponible()) < cantidadParaSacar)) {
            extraerDinero(cantidadParaSacar);
            actualizarDineroTarjetaCredito(tarjCred, cantidadParaSacar);
        } else {
            System.out.println("No tienes suficiente dinero!");
        }
        System.out.println("==================");
    }

    public void sacarDineroDebito(Tarjeta tarjeta, int cantidadParaSacar) {
        System.out.println("==================");
        TarjetaDebito tarjDeb = (TarjetaDebito) tarjeta;
        if (!(tarjDeb.getSaldoDisponible() < cantidadParaSacar)) {
            System.out.println("Sacando dinero....");
            extraerDinero(cantidadParaSacar);
            tarjDeb.setSaldoDisponible(tarjDeb.getSaldoDisponible() - cantidadParaSacar);
        } else {
            System.out.println("No tienes suficiente dinero!");
        }
        System.out.println("==================");
    }

    private void extraerDinero(int cantidadParaSacar) {
        int[][] desglose = {{500, 0}, {200, 0}, {100, 0}, {50, 0}, {20, 0}, {10, 0}, {5, 0}};
        int cantidadAcumulada = 0;
        System.out.println("Desglose de la cantidad satisfecha");
        for (int i = 0; i < billetes.length; i++) {
            for (int j = billetes[i][1]; j > 0; j--) {
                if (cantidadAcumulada + billetes[i][0] <= cantidadParaSacar) {
                    cantidadAcumulada = cantidadAcumulada + billetes[i][0];
                    billetes[i][1]--;
                    desglose[i][1]++;
                } else {
                    break;
                }
            }
            System.out.println(desglose[i][1] + " billetes de " + desglose[i][0]);
        }
    }

    private void actualizarDineroTarjetaCredito(TarjetaCredito tarjeta, int cantidadParaSacar) {
        double baseDisponible = tarjeta.getSaldoDisponible();
        double credito = tarjeta.getCreditoDisponible();

        if (baseDisponible >= cantidadParaSacar) {
            tarjeta.setSaldoDisponible(baseDisponible - cantidadParaSacar);
        } else {
            tarjeta.setCreditoDisponible((credito + baseDisponible) - cantidadParaSacar);
            tarjeta.setSaldoDisponible(0);
        }
    }

    public int cantidadDineroCajero() { //1405 total
        int ct = 0;
        for (int i = 0; i < billetes.length; i++) {
            for (int j = 0; j < billetes[i][1]; j++) {
                ct += billetes[i][0];
            }
        }
        return ct;
    }

    public int getIdUltCaj() {
        return idUltCaj;
    }

    public void setIdUltCaj(int idUltCaj) {
        this.idUltCaj = idUltCaj;
    }

    public int getIdCaj() {
        return idCaj;
    }

    public void setIdCaj(int idCaj) {
        this.idCaj = idCaj;
    }

    public int[][] getBilletes() {
        return billetes;
    }

    public void setBilletes(int[][] billetes) {
        this.billetes = billetes;
    }

    public List<Tarjeta> getListaTarjetas() {
        return listaTarjetas;
    }

    public void setListaTarjetas(List<Tarjeta> listaTarjetas) {
        this.listaTarjetas = listaTarjetas;
    }

}
