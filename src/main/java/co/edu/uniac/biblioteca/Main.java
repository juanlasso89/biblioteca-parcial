package co.edu.uniac.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. libro1: constructor con parámetros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 3, 1);

        // 2. libro2: constructor por defecto + datos por consola
        Libro libro2 = new Libro();
        System.out.println("=== Datos para libro2 ===");
        System.out.print("Título: ");
        libro2.setTitulo(sc.nextLine());
        System.out.print("Autor: ");
        libro2.setAutor(sc.nextLine());
        libro2.setNumEjemplares(leerEntero(sc, "Número de ejemplares: "));
        libro2.setNumPrestados(leerEntero(sc, "Número de ejemplares prestados: "));

        // 3. libroTextoUNIAC con todos sus atributos
        LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
                "Programación Orientada a Objetos", "Juan Pérez", 5, 2,
                "Programación II", "Facultad de Ingeniería");

        // 4. novela indicando su tipo
        Novela novela = new Novela("El coronel no tiene quien le escriba",
                "Gabriel García Márquez", 2, 2, TipoNovela.REALISTA);

        System.out.println("\n=== Objetos creados ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroTextoUNIAC);
        System.out.println(novela);

        // Pruebas de préstamo y devolución
        System.out.println("\n=== Pruebas de préstamo y devolución ===");
        probar(libro1);
        probar(libro2);
        probar(libroTextoUNIAC);
        probar(novela);   // 2 de 2 prestados: el préstamo debe fallar

        sc.close();
    }

    private static void probar(Libro libro) {
        System.out.println("\n" + libro);
        System.out.println("  prestamo()   -> " + libro.prestamo() + "  | prestados: " + libro.getNumPrestados());
        System.out.println("  devolucion() -> " + libro.devolucion() + " | prestados: " + libro.getNumPrestados());
    }

    private static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                int valor = Integer.parseInt(sc.nextLine().trim());
                if (valor >= 0) {
                    return valor;
                }
            } catch (NumberFormatException e) {
                // se vuelve a pedir
            }
            System.out.println("  Ingrese un número entero mayor o igual a 0.");
        }
    }
}
