package heranca;

public class Professor extends Pessoa{

    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;
    
    public String retornarDadosProfessor() {
        String dados;
        
        dados = super.retornaDados();
        
        dados += "Matricula Professor: " + matriculaProfessor + "\n";
        dados += "Data de admissão: " + dataAdmissao + "\n";
        dados += "Salario horista: " + salarioHorista + "\n";
        
        return dados;
    }
    
}
