package heranca;

public class Aluno extends PessoaFisica {

    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;
    
    
    public Aluno() {
        super();
    }
    
    public Aluno(String nome, String rg, String cpf, int registroAluno,
            float notaVestibular, String curso, String dataMatricula) {
        
        super();
        
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.registroAluno = registroAluno;
        this.notaVestibular = notaVestibular;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }
    
    @Override
    public String retornaDados() {
        String dados;

        // Recupera os dados da classe herdada - REPARE NA PALAVRA SUPER
        dados = super.retornaDados();

        // Acrescenta os dados do aluno
        dados += "RA.: " + registroAluno + "\n";
        dados += "Nota do vestibular.: " + notaVestibular + "\n";
        dados += "Curso.: " + curso + "\n";
        dados += "Data Matricula.: " + dataMatricula + "\n";

        return dados;
    }

}
