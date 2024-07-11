package Patrones_Creacionales.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de BibliotecaConcreta
        Biblioteca biblioteca = new BibliotecaConcreta();
        // Usar la biblioteca para prestar libros de diferentes tipos
        biblioteca.prestarLibro("ficcion");
        biblioteca.prestarLibro("noFiccion");
    }
}
