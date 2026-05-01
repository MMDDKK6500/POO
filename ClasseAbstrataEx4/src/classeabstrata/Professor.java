package classeabstrata;

public class Professor extends Funcionario {
    private String materia;
    private String turma;
    
    @Override
    public String retornaDados() {
        
        String dados = "";
        
        dados += "Nome: " + super.getNome() + "\n";
        dados += "RG: " + super.getRg() + "\n";
        dados += "CPF: " + super.getCpf() + "\n";
        dados += "Departamento: " + super.getDepartamento() + "\n";
        dados += "Cargo: " + super.getCargo() + "\n";
        dados += "Crachá: " + super.getId() + "\n";
        dados += "Matéria: " + this.materia + "\n";
        dados += "Turma: " + this.turma + "\n";
        
        return dados;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
}
