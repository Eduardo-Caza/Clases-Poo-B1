// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        Ajedrez ajedrez = new Ajedrez(2);
        Futbol futbol = new Futbol(22);
        Cartas cartas = new Cartas(4);
        VideoJuegos videojuegos = new VideoJuegos(1);
        Atletismo atletismo = new Atletismo(8);

        ajedrez.jugar();
        futbol.jugar();
        cartas.jugar();
        videojuegos.jugar();
        atletismo.jugar();
}
}