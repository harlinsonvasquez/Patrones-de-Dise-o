package Patrones_Creacionales.FactoryMethod;
//esta es una subclase que se extiende de la clase libro e implementa el metodo de la clase principal
class LibroFiccion extends Libro{
    @Override
    public void prestar() {
        System.out.println("prestando libro ficcion");
    }
}
class LibroNoFiccion extends Libro{
    @Override
    public void prestar() {
        System.out.println("prestando libro no ficcion");
    }
}
