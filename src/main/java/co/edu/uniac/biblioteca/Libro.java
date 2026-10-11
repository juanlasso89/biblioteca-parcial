package co.edu.uniac.biblioteca;

/**
 * Clase base que representa un libro de la biblioteca.
 * Aplica abstracción (modela solo lo relevante de un libro) y
 * encapsulamiento (atributos privados con getters y setters).
 */
public class Libro {

    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numPrestados;

    /** Constructor por defecto: crea un libro vacío. */
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numPrestados = 0;
    }

    /** Constructor con todos los atributos. */
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    // ---------- Getters y setters ----------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }

    // ---------- Operaciones ----------

    /**
     * Presta un ejemplar: incrementa numPrestados.
     * No se puede prestar si no quedan ejemplares disponibles.
     *
     * @return true si se realizó el préstamo, false en caso contrario
     */
    public boolean prestamo() {
        if (numPrestados < numEjemplares) {
            numPrestados++;
            return true;
        }
        return false;
    }

    /**
     * Devuelve un ejemplar: decrementa numPrestados.
     * No se puede devolver si no hay ejemplares prestados.
     *
     * @return true si se realizó la devolución, false en caso contrario
     */
    public boolean devolucion() {
        if (numPrestados > 0) {
            numPrestados--;
            return true;
        }
        return false;
    }

    /** Muestra los datos del libro. */
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo
                + ", autor=" + autor
                + ", ejemplares=" + numEjemplares
                + ", prestados=" + numPrestados + "]";
    }
}
