
import java.util.*;

public class Inventario {

    private List<Producto> productos = new ArrayList<>();
    private ArchivoInventario archivo = new ArchivoInventario();

    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado.");
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("Inventario vacío.");
            return;
        }

        for (Producto p : productos) {
            System.out.println(p.mostrarInfo());
        }
    }

    public void guardar() {
        archivo.guardarDatos(productos);
    }

    public void cargar() {
        productos = archivo.cargarDatos();
        System.out.println("Inventario cargado.");
    }
}
