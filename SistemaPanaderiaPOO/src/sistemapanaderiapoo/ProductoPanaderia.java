package sistemapanaderiapoo;

public class ProductoPanaderia {

    // Atributos de la clase madre
    private String nombre;
    private int codigo;
    private double precio;
    private boolean disponible;

    // Constructor 1: constructor vacío
    public ProductoPanaderia() {
        this("Producto sin nombre", 0, 0.0, false);
    }

    // Constructor 2: recibe nombre y precio
    public ProductoPanaderia(String nombre, double precio) {
        this(nombre, 0, precio, true);
    }

    // Constructor 3: recibe todos los datos
    public ProductoPanaderia(String nombre, int codigo, double precio, boolean disponible) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.disponible = disponible;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Setter del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter del código
    public int getCodigo() {
        return codigo;
    }

    // Setter del código
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Getter del precio
    public double getPrecio() {
        return precio;
    }

    // Setter del precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter de disponible
    public boolean isDisponible() {
        return disponible;
    }

    // Setter de disponible
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método toString
    @Override
    public String toString() {
        return "ProductoPanaderia {" + "nombre='" + nombre + '\'' + ", codigo=" + codigo + ", precio=" + precio + ", disponible=" + disponible + '}';
    }
}
