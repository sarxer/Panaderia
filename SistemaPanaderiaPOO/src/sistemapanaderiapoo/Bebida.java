package sistemapanaderiapoo;

public class Bebida extends ProductoPanaderia {

    // Atributos propios de Bebida
    private String tipo;
    private int mililitros;
    private double temperatura;
    private boolean tieneAzucar;

    // Constructor 1: constructor vacío
    public Bebida() {
        super();

        this.tipo = "Sin especificar";
        this.mililitros = 0;
        this.temperatura = 0.0;
        this.tieneAzucar = false;
    }

    // Constructor 2: recibe nombre, precio y tipo
    public Bebida(String nombre, double precio, String tipo) {
        super(nombre, precio);

        this.tipo = tipo;
        this.mililitros = 350;
        this.temperatura = 20.0;
        this.tieneAzucar = true;
    }

    // Constructor 3: recibe todos los datos
    public Bebida(String nombre, int codigo, double precio, boolean disponible, String tipo, int mililitros, double temperatura, boolean tieneAzucar) {

        super(nombre, codigo, precio, disponible);

        this.tipo = tipo;
        this.mililitros = mililitros;
        this.temperatura = temperatura;
        this.tieneAzucar = tieneAzucar;
    }

    // Getter tipo
    public String getTipo() {
        return tipo;
    }

    // Setter tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter mililitros
    public int getMililitros() {
        return mililitros;
    }

    // Setter mililitros
    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    // Getter temperatura
    public double getTemperatura() {
        return temperatura;
    }

    // Setter temperatura
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    // Getter azúcar
    public boolean isTieneAzucar() {
        return tieneAzucar;
    }

    // Setter azúcar
    public void setTieneAzucar(boolean tieneAzucar) {
        this.tieneAzucar = tieneAzucar;
    }

   
}
