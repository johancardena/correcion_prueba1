package FigurasRegulares;

public class Cuadrado {
    private double lado;

    // Constructor sin parámetros
    public Cuadrado() {
        this.lado = 0;
    }

    // Constructor con parámetros
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        return lado * lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
