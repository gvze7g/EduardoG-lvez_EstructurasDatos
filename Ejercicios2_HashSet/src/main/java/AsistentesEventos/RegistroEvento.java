package AsistentesEventos;
import java.util.HashSet;

public class RegistroEvento {
    private HashSet<String> codigos = new HashSet<>();

     public void registrarParticipante(String codigo) {
         if (codigos.contains(codigo)) {
             System.out.println("Codigo: " + codigo + ": Ya registrado");
         }
         else{
             codigos.add(codigo);
             System.out.println("Codigo " + codigo + ": Registrado correctamente");
         }
     }

     public void mostrarAsistentes() {
         System.out.println("Asistentes unicos: ");
            for (String codigo: codigos) {
                System.out.println(codigo);
            }
     }
}
