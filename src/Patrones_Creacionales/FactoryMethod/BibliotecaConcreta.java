package Patrones_Creacionales.FactoryMethod;

public class BibliotecaConcreta extends Biblioteca{
    @Override
    public Libro crearLibro(String tipo) {
        // Crear el tipo de libro basado en el parámetro tipo
        if (tipo.equals("ficcion")) {
            return new LibroFiccion();
        } else if (tipo.equals("noFiccion")) {
            return new LibroNoFiccion();
        } else {
            return null;
        }
    }
}
