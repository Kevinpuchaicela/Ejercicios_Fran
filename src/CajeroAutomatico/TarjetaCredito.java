package CajeroAutomatico;

public class TarjetaCredito extends Tarjeta {
    private double saldoDisponible;
    private double creditoDisponible;

    public TarjetaCredito(String NIF, int PIN, String nombre, String apellido, double saldoDisponible, double creditoDisponible) {
        super(NIF, PIN, nombre, apellido);
        this.saldoDisponible = saldoDisponible;
        this.creditoDisponible = creditoDisponible;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public double getCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(double creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    @Override
    public void mostrarTarjeta() {
        super.mostrarTarjeta();
        System.out.println("Saldo disponible: " + saldoDisponible);
        System.out.println("Credito disponible: " + creditoDisponible);
    }
}
