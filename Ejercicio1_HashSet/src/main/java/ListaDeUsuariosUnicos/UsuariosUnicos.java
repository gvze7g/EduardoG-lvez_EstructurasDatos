package ListaDeUsuariosUnicos;

import java.util.HashSet;

public class UsuariosUnicos {
    private HashSet<String> usuarios = new HashSet<>();

    public void agregarUsuarios() {
        usuarios.add("Javier");
        usuarios.add("Oscar");
        usuarios.add("Gálvez");
        usuarios.add("Oscar");
        usuarios.add("Salvador");
    }

    public int contarUsuariosUnicos() {
        return usuarios.size();
    }

    public boolean existeUsuario(String nombre){
        return usuarios.contains(nombre);
    }
}
