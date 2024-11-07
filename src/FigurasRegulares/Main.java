package FigurasRegulares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuadrado cuadrado = new Cuadrado();
        System.out.print("Ingrese el lado del cuadrado: ");
        cuadrado.setLado(scanner.nextDouble());
        System.out.printf("Área del Cuadrado: %.2f%n", cuadrado.calcularArea());
        System.out.printf("Perímetro del Cuadrado: %.2f%n", cuadrado.calcularPerimetro());
        System.out.print("--------------------------------------------------------------\n");

        Rectangulo rectangulo = new Rectangulo();
        System.out.print("Ingrese el ancho del rectángulo: ");
        rectangulo.setAncho(scanner.nextDouble());
        System.out.print("Ingrese la altura del rectángulo: ");
        rectangulo.setAltura(scanner.nextDouble());
        System.out.printf("Área del Rectángulo: %.2f%n", rectangulo.calcularArea());
        System.out.printf("Perímetro del Rectángulo: %.2f%n", rectangulo.calcularPerimetro());
        System.out.print("--------------------------------------------------------------\n");

        Circulo circulo = new Circulo();
        System.out.print("Ingrese el radio del círculo: ");
        circulo.setRadio(scanner.nextDouble());
        System.out.printf("Área del Círculo: %.2f%n", circulo.calcularArea());
        System.out.printf("Perímetro del Círculo: %.2f%n", circulo.calcularPerimetro());
        System.out.print("--------------------------------------------------------------\n");

        Triangulo triangulo = new Triangulo();
        System.out.print("Ingrese la base del triángulo: ");
        triangulo.setBase(scanner.nextDouble());
        System.out.print("Ingrese la altura del triángulo: ");
        triangulo.setAltura(scanner.nextDouble());
        System.out.printf("Área del Triángulo: %.2f%n", triangulo.calcularArea());
        System.out.printf("Perímetro del Triángulo (equilátero): %.2f%n", triangulo.calcularPerimetro());
        System.out.print("--------------------------------------------------------------\n");

        // Calcular sumatoria de áreas
        double sumatoriaAreas = cuadrado.calcularArea() + rectangulo.calcularArea() +
                circulo.calcularArea() + triangulo.calcularArea();
        System.out.printf("Sumatoria de las áreas de las cuatro figuras: %.2f%n", sumatoriaAreas);

        scanner.close();
    }
}
