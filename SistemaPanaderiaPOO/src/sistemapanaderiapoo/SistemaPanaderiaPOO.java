package sistemapanaderiapoo;

public class SistemaPanaderiaPOO {

    public static void main(String[] args) {

        System.out.println("Sistema de Panaderia POO");
        System.out.println();

        // Constructor de 2 parametros: se conoce el nombre y el precio.
        ProductoPanaderia producto1 = new ProductoPanaderia("Harina de trigo", 5000);

        // Constructor de 4 parametros: se conocen todos los datos del producto.
        ProductoPanaderia producto2  = new ProductoPanaderia("Azucar", 102, 4500, true);

        // Constructor vacio: se utilizan los valores predeterminados.
        Pan pan1 = new Pan();

        // Constructor de 3 parametros: se conoce nombre, precio y tipo de harina.
        Pan pan2  = new Pan("Pan frances", 1200, "Harina de trigo");

        // Constructor completo: se conocen todos los datos del pan.
        Pan pan3 = new Pan( "Pan integral", 201, 2500, true,"Harina integral", 120, 1000,true);

        // Constructor de 3 parametros: se conoce nombre, precio y sabor.
        Pastel pastel1 = new Pastel("Pastel de chocolate", 35000, "Chocolate");

        // Constructor completo: se conocen todos los datos del pastel.
        Pastel pastel2 = new Pastel( "Pastel de fresa", 302, 42000,  true, "Fresa", 12, 2.0, true );

        // Constructor vacio: se utilizan los valores predeterminados.
        Bebida bebida1 = new Bebida();

        // Constructor de 3 parametros: se conoce nombre, precio y tipo de bebida.
        Bebida bebida2 = new Bebida("Cafe", 4000, "Cafe caliente");

        System.out.println("Productos:");
        System.out.println(producto1);
        System.out.println(producto2);

        System.out.println();
        System.out.println("Panes:");
        System.out.println(pan1);
        System.out.println(pan2);
        System.out.println(pan3);

        System.out.println();
        System.out.println("Pasteles:");
        System.out.println(pastel1);
        System.out.println(pastel2);

        System.out.println();
        System.out.println("Bebidas:");
        System.out.println(bebida1);
        System.out.println(bebida2);
    }
}
