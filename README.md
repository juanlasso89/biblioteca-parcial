# Sistema de Gestión de Biblioteca

Parcial I - Programación II (G411). POO: abstracción, encapsulamiento y herencia con Maven + Git.

**Integrantes:** Juan y Samir

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
    PREGUNTAS_TEORICAS.md
```

## Compilar y ejecutar

```bash
mvn compile
mvn exec:java
```

(`exec:java` usa la clase `co.edu.uniac.biblioteca.Main`, configurada en el `pom.xml`.)
Al ejecutar se piden por consola los datos de `libro2`.

## Reparto del trabajo

| Integrante | Rama | Contenido |
|------------|------|-----------|
| Juan  | `feature/juan-base` | `pom.xml`, `.gitignore`, `Libro`, `LibroTexto`, documentación (UML y preguntas) |
| Samir | `feature/samir-herencia` | `LibroTextoUNIAC`, `TipoNovela`, `Novela`, `Main` |
