
import java.io.*;
import java.util.*;

public class ArchivoInventario implements IAlmacenable {

    private static final String ARCHIVO = "inventario.txt";

    @Override
    public void guardarDatos(List<Producto> productos) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO))) {
            for (Producto p : productos) {
                writer.println(p.mostrarInfo());
            }
            System.out.println("Inventario guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
        }
    }

    @Override
    public List<Producto> cargarDatos() {
        List<Producto> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int cantidad = Integer.parseInt(datos[2]);
                double precio = Double.parseDouble(datos[3]);
                String tipo = datos[4];

                if (tipo.equals("Electronico")) {
                    lista.add(new ProductoElectronico(id, nombre, cantidad, precio));
                } else {
                    lista.add(new ProductoPerecedero(id, nombre, cantidad, precio));
                }
            }
        } catch (IOException e) {
            System.out.println("No hay archivo de inventario aún.");
        }
        return lista;
    }
}
