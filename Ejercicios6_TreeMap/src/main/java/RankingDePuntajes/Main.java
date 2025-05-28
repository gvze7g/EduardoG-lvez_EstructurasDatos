package RankingDePuntajes;

public class Main {
    public static void main(String[] args) {
        RankingPuntajes rp = new RankingPuntajes();

        rp.agregarJugador("Van Dijk", 89);
        rp.agregarJugador("Cristiano Ronaldo", 90);
        rp.agregarJugador("Mbappé", 91);
        rp.agregarJugador("Messi", 88);
        rp.agregarJugador("Raphinha", 84);

        rp.mostrarRanking();
        rp.mostrarMaximo();
    }
}

