package br.dev.mmddkk.calculadora;

public class Calculos {
    
    private double num1, num2;
    
    public double somar() {
        return this.num1 + this.num2;
    }
    
    public double subtrair() {
        return this.num1 - this.num2;
    }
    
    public double multiplicar() {
        return this.num1 * this.num2;
    }
    
    public double dividir() throws IllegalArgumentException {
        if (this.num2 == 0) throw new IllegalArgumentException();
        return this.num1 / this.num2;
    }
    
    public double quadrado() {
        return Math.pow(this.num1, 2.0);
    }

    public double getNumero1() {
        return num1;
    }

    public void setNumero1(double num1) {
        this.num1 = num1;
    }

    public double getNumero2() {
        return num2;
    }

    public void setNumero2(double num2) {
        this.num2 = num2;
    }    
    
}
