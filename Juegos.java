// Superclase Juegos
class Juegos {
    // Atributos y métodos comunes a todos los juegos
    String nombre;
    int jugadores;

    public Juegos(String nombre, int jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public void jugar() {
        System.out.println("¡Jugando " + nombre + " con " + jugadores + " jugadores!");
    }
}





