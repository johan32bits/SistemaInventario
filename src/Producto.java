
public abstract class Producto {
    protected int id;
    protected String nombre;
    protected int cantidad;
    protected double precio;

    public Producto(int id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract String getTipo();

    public String mostrarInfo() {
        return id + "," + nombre + "," + cantidad + "," + precio + "," + getTipo();
    }
}
