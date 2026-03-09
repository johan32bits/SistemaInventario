
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Guardar inventario");
            System.out.println("4. Cargar inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();

            switch(opcion) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    System.out.println("Tipo: 1 Electronico | 2 Perecedero");
                    int tipo = sc.nextInt();

                    if (tipo == 1) {
                        inventario.agregarProducto(new ProductoElectronico(id,nombre,cantidad,precio));
                    } else {
                        inventario.agregarProducto(new ProductoPerecedero(id,nombre,cantidad,precio));
                    }
                    break;

                case 2:
                    inventario.mostrarInventario();
                    break;

                case 3:
                    inventario.guardar();
                    break;

                case 4:
                    inventario.cargar();
                    break;
            }

        } while(opcion != 5);

        System.out.println("Sistema finalizado.");
    }
}
