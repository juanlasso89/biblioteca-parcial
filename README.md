# Sistema de Gestión de Biblioteca

Parcial I - Programación II (G411). POO: abstracción, encapsulamiento y herencia con Maven + Git.

**Integrantes:** Juan sebastian lasso y Samir correa alvarez

## Estructura

```
pom.xml
src/main/java/co/edu/uniac/biblioteca/
    Libro.java            (clase base)
    LibroTexto.java       (hereda de Libro, atributo curso)
    LibroTextoUNIAC.java  (hereda de LibroTexto, atributo facultad)
    Novela.java           (hereda de Libro, atributo tipo)
    TipoNovela.java       (enum)
    Main.java             (crea los 4 objetos y prueba préstamo/devolución)
docs/
    UML.md                (diagrama de clases)
 




