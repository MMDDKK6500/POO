package exemplointerface2;

public class FuncionarioDiarista implements Operacoes {
    // Atributos locais
    String nome;
    double valorHora;
    int diasTrabalhados;
    int mediaHora;
            
    // Método construtor da classe
    public FuncionarioDiarista(String nome, double valorHora, int diasTrabalhados, int mediaHora) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.diasTrabalhados = diasTrabalhados;
        this.mediaHora = mediaHora;
    }
    
    @Override
    public double calcularSalarioLiquido() {
        // Abaixo o cálculo, conforme a regra de negócio
        return this.mediaHora * valorHora * diasTrabalhados;
    }
    
    public double horasTrabalhadas() {
        return (this.mediaHora * this.diasTrabalhados);
    }
}