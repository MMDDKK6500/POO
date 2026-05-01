package exemplointerface2;

public class FuncionarioMensalista implements Operacoes {
    // Definição dos atributos
    String nome;
    double salario;
    // Construtor da classe recebe parâmetros de entrada e "seta" localmente
    public FuncionarioMensalista(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    // De forma OBRIGATORIA, Sobrescrevendo o método de calculo de salário:
    @Override
    public double calcularSalarioLiquido() {
        // Abaixo foi pego uma das Aliquotas de IRPF, apenas para aprendizado
        return this.salario - this.salario * 27.5 / 100;
    }
}
