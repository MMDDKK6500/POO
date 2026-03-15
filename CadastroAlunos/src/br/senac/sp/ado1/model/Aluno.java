package br.senac.sp.ado1.model;

public class Aluno {
    private int id;
    private String nomeAluno;
    private String numeroTelefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
//        return "Aluno{" + "id=" + id + ", nomeAluno=" + nomeAluno + ", numeroTelefone=" + numeroTelefone + '}';
        return String.format(
        """
        \tId: %d
        \tNome: %s
        \tTelefone: %s
        """,
        this.id, this.nomeAluno, this.numeroTelefone);
    }
    
    
    
}
