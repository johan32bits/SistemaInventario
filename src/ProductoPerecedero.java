
public class ProductoPerecedero extends Producto {

    public ProductoPerecedero(int id, String nombre, int cantidad, double precio) {
        super(id, nombre, cantidad, precio);
    }

    @Override
    public String getTipo() {
        return "Perecedero";
    }
}
