package RegistroDeTemperaturas;

public class Main {
    public static void main(String[] args) {
        RegistroTemperaturas rt = new RegistroTemperaturas();

        rt.agregarCiudad("Lima", 22.5);
        rt.agregarCiudad("Arequipa", 18.0);
        rt.agregarCiudad("Cusco", 10.5);
        rt.agregarCiudad("Trujillo", 24.3);
        rt.agregarCiudad("Piura", 30.2);

        rt.mostrarCiudadesOrdenadas();
        rt.mostrarExtremos();
    }
}