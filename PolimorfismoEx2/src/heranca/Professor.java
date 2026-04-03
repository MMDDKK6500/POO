package heranca;

public class Professor extends PessoaJuridica {
    
    int matriculaProfessor;
    String dataAdmissao;
    String materia;
    
    public Professor() {
        super();
    }
    
    public Professor(String nome, String endereco, int idade, int matriculaProfessor,
            double salarioMensal, String dataAdmissao, String materia, String cnpj) {
        
        super();
        
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.matriculaProfessor = matriculaProfessor;
        this.dataAdmissao = dataAdmissao;
        this.cnpj = cnpj;
        this.salarioMensal = salarioMensal;
        this.materia = materia;
    }
    
    @Override
    public String retornaDados() {
        String dados;

        // Recupera os dados da classe herdada - REPARE NA PALAVRA SUPER
        dados = super.retornaDados();
        
        dados += "Matricula: " + matriculaProfessor + "\n";
        dados += "Data de admissão: " + dataAdmissao + "\n";
        dados += "Salario mensal: " + salarioMensal + "\n";
        dados += "Matéria: " + materia + "\n";
        
        return dados;
    }
}
