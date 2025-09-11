import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {
        inventarioApp(new HashMap<String, Integer>());
    }

    public static void inventarioApp(HashMap<String, Integer> inventario) {
        Scanner sc = new Scanner(System.in);
        String menu;

        while (true) {
            System.out.println("Bienvenido a su inventario\n1. Agregar producto\n2. Mostrar inventario\n3. Buscar producto\n4. Salir");
            menu = sc.nextLine();

            if (menu.equals("1")) {
                añadirProducto(sc, inventario);
            } else if (menu.equals("2")) {
                leerInventario(inventario);
            } else if (menu.equals("4")) {
                break;
            } else {
                buscarProducto(sc, inventario);
            }
        }  
    }

    public static void añadirProducto(Scanner sc, HashMap<String,Integer> inventario) {
        System.out.println("Cuantos productos desea añadir?"); // Nos pide la cantidad de productos que queremos agregar para el for
        int nProductos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nProductos; i++) { // Debido a que i es 0 debera recorrerlo hasta que llegue a la cantidad de nProductos 
            System.out.println("Añada el nombre del producto: ");
            String nombreProducto = sc.nextLine();

            System.out.println("Añada la cantidad del producto: ");
            Integer cantidadProducto = sc.nextInt();
            sc.nextLine();
            inventario.put(nombreProducto, cantidadProducto);
       }
       
    }

    public static void leerInventario(HashMap<String,Integer> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos disponibles actualmente");
        } else {
            for (Map.Entry<String,Integer> productos : inventario.entrySet()) {
                System.out.println("Productos: " + productos.getKey() + " - " + "Cantidad: " + productos.getValue());
            }
        }
    }

    public static void buscarProducto(Scanner sc,HashMap<String,Integer> inventario) {
        System.out.println("Escriba el nombre del producto que desea buscar");
        var buscadorProducto = sc.nextLine();

        for (Map.Entry<String,Integer> buscador : inventario.entrySet()) {
            if (buscadorProducto.equals(buscador.getKey())) {
                System.out.println("Producto encontrado!");
            }
        } 
    }
}
