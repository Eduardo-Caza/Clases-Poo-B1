public class Conversiones {
    public static void main(String[] args) {
        // Integer a Double
        Integer numero = 512;
        Double doble = numero.doubleValue();
        System.out.println("Doble: " + doble);

        // Double a Integer
        numero = doble.intValue();
        System.out.println("Numero: " + numero);

        // Integer a Float
        Float flotante = numero.floatValue();
        System.out.println("Flotante: " + flotante);

        // Float a Integer
        numero = flotante.intValue();
        System.out.println("Numero: " + numero);
    }
}
