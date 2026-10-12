package co.edu.uniac.biblioteca;

/** Novela de un tipo determinado. Hereda de {@link Libro}. */
public class Novela extends Libro {

    private TipoNovela tipo;

    public Novela() {
        super();
        this.tipo = null;
    }

    public Novela(String titulo, String autor, int numEjemplares, int numPrestados, TipoNovela tipo) {
        super(titulo, autor, numEjemplares, numPrestados);
        this.tipo = tipo;
    }

    public TipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Novela [" + super.toString() + ", tipo=" + tipo + "]";
    }
}
