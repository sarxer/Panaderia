package sistemapanaderiapoo;

public class Pastel extends ProductoPanaderia {

    // Atributos propios de Pastel
    private String sabor;
    private int porciones;
    private double pesoKg;
    private boolean tieneRelleno;

    // Constructor 1: constructor vacío
    public Pastel() {
        super();

        this.sabor = "Sin sabor";
        this.porciones = 0;
        this.pesoKg = 0.0;
        this.tieneRelleno = false;
    }

    // Constructor 2: recibe nombre, precio y sabor
    public Pastel(String nombre, double precio, String sabor) {
        super(nombre, precio);

        this.sabor = sabor;
        this.porciones = 8;
        this.pesoKg = 1.0;
        this.tieneRelleno = false;
    }

    // Constructor 3: recibe todos los datos
    public Pastel(String nombre, int codigo, double precio,boolean disponible, String sabor,int porciones, double pesoKg,boolean tieneRelleno) {

        super(nombre, codigo, precio, disponible);

        this.sabor = sabor;
        this.porciones = porciones;
        this.pesoKg = pesoKg;
        this.tieneRelleno = tieneRelleno;
    }

    // Getter sabor
    public String getSabor() {
        return sabor;
    }

    // Setter sabor
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    // Getter porciones
    public int getPorciones() {
        return porciones;
    }

    // Setter porciones
    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    // Getter peso
    public double getPesoKg() {
        return pesoKg;
    }

    // Setter peso
    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    // Getter relleno
    public boolean isTieneRelleno() {
        return tieneRelleno;
    }

    // Setter relleno
    public void setTieneRelleno(boolean tieneRelleno) {
        this.tieneRelleno = tieneRelleno;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pastel{"
                + "nombre='" + getNombre() + '\''
                + ", codigo=" + getCodigo()
                + ", precio=" + getPrecio()
                + ", disponible=" + isDisponible()
                + ", sabor='" + sabor + '\''
                + ", porciones=" + porciones
                + ", pesoKg=" + pesoKg
                + ", tieneRelleno=" + tieneRelleno
                + '}';
    }
}
