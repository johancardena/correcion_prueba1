package FigurasRegulares;

public class Triangulo {
    private double base;
    private double altura;

    // Constructor sin parámetros
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Constructor con parámetros
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 3 * base;
    }
}
