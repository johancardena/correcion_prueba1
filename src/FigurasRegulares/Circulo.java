package FigurasRegulares;

public class Circulo {
    private double radio;

    // Constructor sin parámetros
    public Circulo() {
        this.radio = 0;
    }

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter y Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
