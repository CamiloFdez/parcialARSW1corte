package parcial.arsw.demo.models;


public class Product {
    private static int idCounter = 1;
    private final int id;
    private final String nombre;
    private final double precio;

    public Product(String nombre, double precio) {
    this.id = idCounter++;
    this.nombre = nombre;
    this.precio = precio;
    }
    public int getId() { return id; }

    public String getNombre() { return nombre; }

    public double getPrecio() { return precio; }
}

