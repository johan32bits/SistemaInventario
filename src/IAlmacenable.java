
import java.util.List;

public interface IAlmacenable {
    void guardarDatos(List<Producto> productos);
    List<Producto> cargarDatos();
}
