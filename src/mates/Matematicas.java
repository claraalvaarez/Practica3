package mates;

import java.util.function.DoubleSupplier;

/**
 * Clase que contiene métodos para aproximación de Pi.
 */
public class Matematicas {

    /**
     * Aproxima el valor de Pi utilizando el método de Montecarlo.
     * @param iterations Número de iteraciones a realizar.
     * @param randomSupplier Proveedor de números aleatorios.
     * @return Aproximación del valor de Pi.
     */
    public static double piApproximate(int iterations, DoubleSupplier randomSupplier) {
        int inside = 0;
        for (int i = 0; i < iterations; i++) {
            double x = randomSupplier.getAsDouble();
            double y = randomSupplier.getAsDouble();
            if (x * x + y * y <= 1) {
                inside++;
            }
        }
        return 4.0 * inside / iterations;
    }

    /**
     * Aproxima el valor de Pi de forma recursiva utilizando el método de Montecarlo.
     * @param iterations Número de iteraciones a realizar.
     * @param randomSupplier Proveedor de números aleatorios.
     * @return Aproximación del valor de Pi.
     */
    public static double piApproximateRecursive(int iterations, DoubleSupplier randomSupplier) {
        return piApproximateRecursive(iterations, 0, 0, randomSupplier);
    }

    private static double piApproximateRecursive(int iterations, int inside, int thrown, DoubleSupplier randomSupplier) {
        if (thrown == iterations) {
            return 4.0 * inside / iterations;
        } else {
            thrown++;
            double x = randomSupplier.getAsDouble();
            double y = randomSupplier.getAsDouble();
            if (x * x + y * y <= 1) {
                inside++;
            }
            return piApproximateRecursive(iterations, inside, thrown, randomSupplier);
        }
    }

    /**
     * Método principal que demuestra el uso de la aproximación de Pi.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Ejemplo de uso
        int iterations = 1000000; // Número de iteraciones
        DoubleSupplier randomSupplier = Math::random; // Generador de números aleatorios
        double pi = piApproximate(iterations, randomSupplier); // Aproximación de Pi
        System.out.println("Aproximación de Pi: " + pi);
    }

    /**
     * Método que genera un número Pi recursivamente (no implementado).
     * @return Número Pi generado.
     */
    public static String generarNumeroPiRecursivo() {
        return null;
    }
}
