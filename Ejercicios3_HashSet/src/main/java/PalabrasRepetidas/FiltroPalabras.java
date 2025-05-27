package PalabrasRepetidas;

import java.util.HashSet;

public class FiltroPalabras {
    public void filtrarYmostrar(String[] palabras) {
        HashSet<String> unicas = new HashSet<>();

        for (String palabra : palabras ) {
            unicas.add(palabra.toLowerCase());
        }

        System.out.println("Palabras únicas en mayúsculas:");
            for (String palabra : unicas) {
                System.out.println(palabra.toUpperCase());
            }
    }
}
