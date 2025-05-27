package DiccionarioDePrecios;

public class Main {
    public static void main(String[] args) {
        DiccionarioDePrecios dp = new DiccionarioDePrecios();

        dp.agregarProductos("Pan", 1.5);
        dp.agregarProductos("Leche", 5);
        dp.agregarProductos("Coca", 2.5);
        dp.agregarProductos("Pinguinito", .75);

        dp.mostrarProductosOrdenados();
        dp.buscarPrecio("Coca");
        dp.mostrarMasBaratoYMasCaro();
    }
}