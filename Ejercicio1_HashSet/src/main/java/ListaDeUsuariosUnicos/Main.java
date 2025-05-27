package ListaDeUsuariosUnicos;

public class Main {
    public static void main(String[] args) {
        UsuariosUnicos uu = new UsuariosUnicos();

        uu.agregarUsuarios();

        System.out.println("Cantidad de Usuarios unicos: " + uu.contarUsuariosUnicos());

        System.out.println("¿Existe el usuario 'Gálvez'? " + uu.existeUsuario("Gálvez"));

    }
}