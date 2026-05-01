package classeabstrata;

public class Aluno extends Pessoa {
    public Aluno(){}
    
    private String registroDoAluno;
    private String dataMatricula;
    private int notaVestibular;
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

    public int getNotaVestibular() {
        return notaVestibular;
    }

    public void setNotaVestibular(int notaVestibular) {
        this.notaVestibular = notaVestibular;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
