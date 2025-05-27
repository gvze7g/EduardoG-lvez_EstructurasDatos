package DiccionarioDePrecios;
import java.util.*;

public class DiccionarioDePrecios {
    private TreeMap<String, Double> productos = new TreeMap<>();

    public void agregarProductos(String nombre, double precio) {
        productos.put(nombre, precio);
    }

    public void buscarPrecio(String nombre) {
        if (productos.containsKey(nombre))
        {
            System.out.println("Precio de " + nombre + ": $" + productos.get(nombre));
        }
        else
        {
            System.out.println(nombre + "no encontrado");
        }
    }

    public void mostrarProductosOrdenados() {
        System.out.println("Productos ordenados alfabeticamente: ");
            productos.forEach((k, v) -> System.out.println("-" + k + ": $" + v));
    }

    public void mostrarMasBaratoYMasCaro() {
        if (!productos.isEmpty()) {
            String masBarato = Collections.min(productos.entrySet(), Map.Entry.comparingByValue()).getKey();
            String masCaro = Collections.max(productos.entrySet(), Map.Entry.comparingByValue()).getKey();

            System.out.println("Producto más barato: " + masBarato + " ($" + productos.get(masBarato) + ")");
            System.out.println("Producto más caro: " + masCaro + " ($" + productos.get(masCaro) + ")");
        }
    }
}
