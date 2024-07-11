package Patrones_Creacionales.Singlenton;

public class Main {
    public static void main(String[] args) {
        // Obtener la única instancia de la clase BibliotecaSingleton
       Singleton biblioteca = Singleton.obtenerInstancia();
        // Usar la instancia para prestar un libro
        biblioteca.prestarLibro("El Quijote");
    }
}
