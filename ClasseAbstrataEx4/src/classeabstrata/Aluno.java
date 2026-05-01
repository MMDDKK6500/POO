package classeabstrata;

public class Aluno implements Pessoa {
    public Aluno(){}
    private String nome;
    private String rg;
    private String cpf;
    
    private String registroDoAluno;
    private String dataMatricula;
    private double notaVestibular;
    private String curso;
    
    @Override
    public String retornaDados() {
        
        String dados = "";
        
        dados += "Nome: " + nome + "\n";
        dados += "RG: " + rg + "\n";
        dados += "CPF: " + cpf + "\n";
        dados += "Registro do aluno: " + registroDoAluno + "\n";
        dados += "Data da matrícula: " + dataMatricula + "\n";        
        dados += "Nota do vestibular: " + notaVestibular + "\n";
        dados += "Curso: " + curso + "\n";
        
        return dados;
    }

    public String getRegistroDoAluno() {
        return registroDoAluno;
    }

    public void setRegistroDoAluno(String registroDoAluno) {
        this.registroDoAluno = registroDoAluno;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public double getNotaVestibular() {
        return notaVestibular;
    }

    public void setNotaVestibular(double notaVestibular) {
        this.notaVestibular = notaVestibular;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
