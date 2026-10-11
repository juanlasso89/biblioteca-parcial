# Preguntas teóricas

## 1. Dos situaciones en las que NO se podría realizar la herencia

### Situación 1: clase declarada `final`

Fragmento de código (si `LibroTexto` se declarara así):

```java
public final class LibroTexto extends Libro { ... }

public class LibroTextoUNIAC extends LibroTexto { ... }   // ERROR
```

**Posible falla:** el compilador muestra `cannot inherit from final LibroTexto`.
Una clase `final` no puede tener subclases, por lo que `LibroTextoUNIAC` no podría
extender de `LibroTexto`.

### Situación 2: constructor `private` en la superclase

Fragmento de código (si `Libro` solo tuviera esto):

```java
public class Libro {
    private Libro() { ... }                       // único constructor, privado
}

public class Novela extends Libro {
    public Novela() { super(); }                  // ERROR
}
```

**Posible falla:** `Libro() has private access in Libro`. Toda subclase debe llamar
(explícita o implícitamente) a un constructor de la superclase, y si ninguno es
accesible no se puede heredar.

### Otras relacionadas (modificadores de acceso)

- Los atributos `private` (`titulo`, `autor`, ...) **no son accesibles directamente**
  en las subclases: `Novela` no puede hacer `this.titulo = "X";`; debe usar
  `getTitulo()` / `setTitulo()`. Por eso el encapsulamiento se respeta.
- Los métodos `final` no se pueden sobrescribir (`override`).

> **Nota:** esto no significa que el código del proyecto falle; son escenarios
> ilustrativos donde la herencia no funcionaría. El código entregado en `src/` no
> contiene estos errores.

## 2. Dos nuevos atributos y un método adicional

**Atributos nuevos para `Libro`:**

1. `isbn` (String): identificador único del libro.
2. `anioPublicacion` (int): año en que se publicó.

**Método adicional con sentido:**

```java
/** Retorna cuántos ejemplares quedan disponibles para prestar. */
public int ejemplaresDisponibles() {
    return numEjemplares - numPrestados;
}
```

Tiene sentido porque la lógica de `prestamo()` ya depende de esa diferencia, y permite
consultar la disponibilidad sin modificar el estado del libro.
