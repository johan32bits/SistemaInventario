
public class ProductoElectronico extends Producto {

    public ProductoElectronico(int id, String nombre, int cantidad, double precio) {
        super(id, nombre, cantidad, precio);
    }

    @Override
    public String getTipo() {
        return "Electronico";
    }
}
