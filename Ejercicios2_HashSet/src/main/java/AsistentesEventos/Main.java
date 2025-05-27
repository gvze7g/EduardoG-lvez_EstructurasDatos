package AsistentesEventos;

public class Main {
    public static void main(String[] args) {
        RegistroEvento evento = new RegistroEvento();

        evento.registrarParticipante("20230315");

        evento.registrarParticipante("20230315");

        evento.registrarParticipante("20230669");

        evento.registrarParticipante("20240420");

        evento.registrarParticipante("20230660");

            evento.mostrarAsistentes();
    }
}