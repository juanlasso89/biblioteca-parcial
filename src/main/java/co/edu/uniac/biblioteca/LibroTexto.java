package co.edu.uniac.biblioteca;

/** Libro de texto asociado a un curso. Hereda de {@link Libro}. */
public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto() {
        super();
        this.curso = "";
    }

    public LibroTexto(String titulo, String autor, int numEjemplares, int numPrestados, String curso) {
        super(titulo, autor, numEjemplares, numPrestados);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "LibroTexto [" + super.toString() + ", curso=" + curso + "]";
    }
}
