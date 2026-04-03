package heranca;

public class Professor extends Pessoa{
    
    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;
    
    public Professor() {
        super();
    }
    
    public Professor(String nome, String rg, String cpf, int matriclaProfessor,
            double salarioHorista, String dataAdmissao) {
        
        super();
        
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.matriculaProfessor = matriclaProfessor;
        this.dataAdmissao = dataAdmissao;
        this.salarioHorista = salarioHorista;
    }
    
    @Override
    public String retornaDados() {
        String dados;

        // Recupera os dados da classe herdada - REPARE NA PALAVRA SUPER
        dados = super.retornaDados();
        
        dados += "Matricula: " + matriculaProfessor + "\n";
        dados += "Data de admissão: " + dataAdmissao + "\n";
        dados += "Salario horista: " + salarioHorista + "\n";
        
        return dados;
    }
}
