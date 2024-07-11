package Patrones_Creacionales.FactoryMethod;

// Clase abstracta que define el método factoryMethod para crear libros
abstract class Biblioteca {
    public abstract Libro crearLibro(String tipo);
    // Método que utiliza el factoryMethod para crear y prestar un libro
    public void prestarLibro(String tipo) {
        Libro libro = crearLibro(tipo);
        libro.prestar();
    }
}
