package heranca;

public class Funcionario extends Pessoa {
    
    String registroFuncionario;
    String dataAdmissao;
    double salarioMensal;
    
    @Override
    public String retornaDados() {
        String dados;

        // Recupera os dados da classe herdada - REPARE NA PALAVRA SUPER
        dados = super.retornaDados();
        
        dados += "Registro do funcionario: " + registroFuncionario + "\n";
        dados += "Data de admissão: " + dataAdmissao + "\n";
        dados += "Salário mensal: " + salarioMensal + "\n";
        
        return dados;
    }
    
}
