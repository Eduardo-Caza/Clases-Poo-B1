// Clase base Videojuego
public class Videojuego {
    private String nombre;

    // Constructor
    public Videojuego(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Clase derivada Tipo que hereda de Videojuego
    static class Tipo extends Videojuego {
        private String tipo;

        // Constructor
        public Tipo(String nombre, String tipo) {
            super(nombre);
            this.tipo = tipo;
        }

        // Getter
        public String getTipo() {
            return tipo;
        }

        // Setter
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }

    // Clase derivada AñoDeLanzamiento que hereda de Tipo
    static class AñoDeLanzamiento extends Tipo {
        private int año;

        // Constructor
        public AñoDeLanzamiento(String nombre, String tipo, int año) {
            super(nombre, tipo);
            this.año = año;
        }

        // Getter
        public int getAño() {
            return año;
        }

        // Setter
        public void setAño(int año) {
            this.año = año;
        }
    }

    // Clase derivada PersonajePrincipal que hereda de AñoDeLanzamiento
    static class PersonajePrincipal extends AñoDeLanzamiento {
        private String personaje;

        // Constructor
        public PersonajePrincipal(String nombre, String tipo, int año, String personaje) {
            super(nombre, tipo, año);
            this.personaje = personaje;
        }

        // Getter
        public String getPersonaje() {
            return personaje;
        }

        // Setter
        public void setPersonaje(String personaje) {
            this.personaje = personaje;
        }
    }

    public static void main(String[] args) {
        // Crear objetos
        Videojuego videojuego = new Videojuego("Super Mario Bros");
        Tipo tipo = new Tipo("Final Fantasy VII", "RPG");
        AñoDeLanzamiento añoDeLanzamiento = new AñoDeLanzamiento("World of Warcraft", "MMORPG", 2004);
        PersonajePrincipal personajePrincipal = new PersonajePrincipal("Dota2", "Combate", 2013, "Cristal Maiden");

        // Imprimir los detalles de los videojuegos
        System.out.println("Nombre: " + videojuego.getNombre());
        System.out.println("Nombre: " + tipo.getNombre() + ", Tipo: " + tipo.getTipo());
        System.out.println("Nombre: " + añoDeLanzamiento.getNombre() + ", Tipo: " + añoDeLanzamiento.getTipo() + ", Año de Lanzamiento: " + añoDeLanzamiento.getAño());
        System.out.println("Nombre: " + personajePrincipal.getNombre() + ", Tipo: " + personajePrincipal.getTipo() + ", Año de Lanzamiento: " + personajePrincipal.getAño() + ", Personaje Principal: " + personajePrincipal.getPersonaje());
    }
}
