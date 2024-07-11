package Patrones_Creacionales.Singlenton;

public class Singleton {
    // Variable estática que contiene la única instancia de la clase
    private static Singleton instanciaUnica;

    // Constructor privado para evitar que se pueda instanciar la clase directamente
    private Singleton() {
    }

    // Método estático para obtener la única instancia de la clase
    public static Singleton obtenerInstancia() {
        // Si la instancia aún no ha sido creada, se crea
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        // Se retorna la instancia única
        return instanciaUnica;
    }

    // Método para prestar un libro, solo para demostrar el uso de la instancia única
    public void prestarLibro(String libro) {
        System.out.println("Prestando el libro: " + libro);
    }
}

