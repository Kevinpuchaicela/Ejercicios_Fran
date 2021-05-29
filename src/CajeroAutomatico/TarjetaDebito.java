package CajeroAutomatico;

public class TarjetaDebito extends Tarjeta {
    private double saldoDisponible;

    public TarjetaDebito(String NIF, int PIN, String nombre, String apellido, double saldoDisponible) {
        super(NIF, PIN, nombre, apellido);
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public void mostrarTarjeta() {
        super.mostrarTarjeta();
        System.out.println("Saldo disponible: " + saldoDisponible);
    }
}
