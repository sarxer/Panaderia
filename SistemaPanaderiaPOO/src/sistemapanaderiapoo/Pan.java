package sistemapanaderiapoo;

public class Pan extends ProductoPanaderia {

    // Atributos propios de Pan
    private String tipoHarina;
    private int pesoGramos;
    private double costoProduccion;
    private boolean integral;

    // Constructor 1: constructor vacío
    public Pan() {
        super();

        this.tipoHarina = "Harina de trigo";
        this.pesoGramos = 0;
        this.costoProduccion = 0.0;
        this.integral = false;
    }

    // Constructor 2: recibe nombre, precio y tipo de harina
    public Pan(String nombre, double precio, String tipoHarina) {
        super(nombre, precio);

        this.tipoHarina = tipoHarina;
        this.pesoGramos = 100;
        this.costoProduccion = 0.0;
        this.integral = false;
    }

    // Constructor 3: recibe todos los datos
    public Pan(String nombre, int codigo, double precio,boolean disponible, String tipoHarina, int pesoGramos, double costoProduccion, boolean integral) {

        super(nombre, codigo, precio, disponible);

        this.tipoHarina = tipoHarina;
        this.pesoGramos = pesoGramos;
        this.costoProduccion = costoProduccion;
        this.integral = integral;
    }

    // Getter tipo de harina
    public String getTipoHarina() {
        return tipoHarina;
    }

    // Setter tipo de harina
    public void setTipoHarina(String tipoHarina) {
        this.tipoHarina = tipoHarina;
    }

    // Getter peso
    public int getPesoGramos() {
        return pesoGramos;
    }

    // Setter peso
    public void setPesoGramos(int pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    // Getter costo de producción
    public double getCostoProduccion() {
        return costoProduccion;
    }

    // Setter costo de producción
    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    // Getter integral
    public boolean isIntegral() {
        return integral;
    }

    // Setter integral
    public void setIntegral(boolean integral) {
        this.integral = integral;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pan{" + "nombre='" + getNombre() + '\'' + ", codigo=" + getCodigo() + ", precio=" + getPrecio() + ", disponible=" + isDisponible() + ", tipoHarina='" + tipoHarina + '\'' + ", pesoGramos=" + pesoGramos + ", costoProduccion=" + costoProduccion + ", integral=" + integral + '}';
    }
}
