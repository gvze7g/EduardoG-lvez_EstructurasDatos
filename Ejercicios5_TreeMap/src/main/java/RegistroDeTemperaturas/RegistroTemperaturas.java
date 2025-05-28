package RegistroDeTemperaturas;

import java.util.*;

public class RegistroTemperaturas {
    private TreeMap<String, Double> temperaturas = new TreeMap<>();

    public void agregarCiudad(String ciudad, double temperatura) {
        temperaturas.put(ciudad, temperatura);
    }

    public void mostrarCiudadesOrdenadas() {
        System.out.println("Ciudades ordenadas alfabéticamente:");
        temperaturas.forEach((ciudad, temp) -> System.out.println(ciudad + ": " + temp + "°C"));
    }

    public void mostrarExtremos() {
        if (!temperaturas.isEmpty()) {
            String ciudadFria = Collections.min(temperaturas.entrySet(), Map.Entry.comparingByValue()).getKey();
            String ciudadCalida = Collections.max(temperaturas.entrySet(), Map.Entry.comparingByValue()).getKey();

            System.out.println("Ciudad más fría: " + ciudadFria + " (" + temperaturas.get(ciudadFria) + "°C)");
            System.out.println("Ciudad más cálida: " + ciudadCalida + " (" + temperaturas.get(ciudadCalida) + "°C)");
        }
    }
}