package br.senac.prj.model;

public class CalcularSalario {
    
    double sl;
    double dc;
    
    public CalcularSalario(double salario, double descontos) {
        sl = salario;
        dc = descontos;
    }
    
    public double Calcular() {
        return sl - dc;
    }
    
}
