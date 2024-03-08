package mates;


import java.util.function.Supplier;

public class Matematicas {
    public static void main(String[] args) {
        int iterations = 10000;
        System.out.println("Approximation of pi using iterative method: " + piApproximate(iterations, () -> Math.random()));
        System.out.println("Approximation of pi using recursive method: " + piApproximateRecursive(iterations, () -> Math.random()));
    }

    public static double piApproximate(int iterations, Supplier<Double> randomSupplier) {
        int inside = 0;
        for (int i = 0; i < iterations; i++) {
            double x = randomSupplier.get();
            double y = randomSupplier.get();
            if (x * x + y * y <= 1) {
                inside++;
            }
        }
        return 4.0 * inside / iterations;
    }

    public static double piApproximateRecursive(int iterations, Supplier<Double> randomSupplier) {
        return piApproximateRecursive(iterations, 0, 0, randomSupplier);
    }

    private static double piApproximateRecursive(int iterations, int inside, int thrown, Supplier<Double> randomSupplier) {
        if (thrown == iterations) {
            return 4.0 * inside / iterations;
        } else {
            thrown++;
            double x = randomSupplier.get();
            double y = randomSupplier.get();
            if (x * x + y * y <= 1) {
                inside++;
            }
            return piApproximateRecursive(iterations, inside, thrown, randomSupplier);
        }
    }

    public static String generarNumeroPiRecursivo(int int1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generarNumeroPiRecursivo'");
    }
}
