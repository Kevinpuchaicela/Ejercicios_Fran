package CajeroAutomatico;

public class Tarjeta implements FuncionesCajero {
    private String NIF;
    private int PIN;
    private String nombre;
    private String apellido;
    private EstadoTarjeta estado;

    public Tarjeta(String NIF, int PIN, String nombre, String apellido) {
        this.NIF = NIF;
        this.PIN = PIN;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = EstadoTarjeta.ACTIVADA;
    }

    public Tarjeta() {

    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public EstadoTarjeta getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarjeta estado) {
        this.estado = estado;
    }


    @Override
    public void mostrarTarjeta() {
        System.out.println("================");
        System.out.println("DATOS DE LA TARJETA DEL CLIENTE");
        System.out.println("nombre : " + nombre);
        System.out.println("Apellido : " + apellido);
        System.out.println("NIF : " + NIF);
    }
}
