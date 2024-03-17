# Practica3
Este archivo contiene una clase Matematicas que proporciona métodos para aproximar el valor de Pi utilizando diferentes enfoques.

Funcionalidades
piApproximate(int iterations, DoubleSupplier randomSupplier): Aproxima el valor de Pi utilizando el método de Monte Carlo. Se especifica el número de iteraciones y un proveedor de números aleatorios para generar puntos en un cuadrado unitario y calcular la fracción de puntos que caen dentro del círculo inscrito.

piApproximateRecursive(int iterations, DoubleSupplier randomSupplier): Similar a piApproximate, pero utiliza un enfoque recursivo para calcular la aproximación de Pi.

main(String[] args): Ejemplo de uso de los métodos piApproximate. Calcula una aproximación de Pi utilizando un millón de iteraciones y muestra el resultado por consola.

generarNumeroPiRecursivo(): Un método no implementado que devuelve null. Se proporciona como esqueleto para una posible funcionalidad futura.
