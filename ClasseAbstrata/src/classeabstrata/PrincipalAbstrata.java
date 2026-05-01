package classeabstrata;

public class PrincipalAbstrata {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        
        a1.setNome("Petrucio das Oliveiras");
        a1.setRg("36.456.789-X");
        a1.setCpf("456.123.789-89");
        a1.setRegistroDoAluno("2443532");
        a1.setDataMatricula("06/02/2022");
        a1.setNotaVestibular(780);
        a1.setCurso("BSI");
        
        System.out.println("\t - Dados do Aluno: " + a1.nome + "-\n");
        System.out.println(a1.retornaDados());
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Heitor Dumas");
        f1.setRg("36.456.789-X");
        f1.setCpf("456.123.789-89");
        f1.setDepartamento("Limpeza e Manutenção");
        f1.setId("152");
        f1.setCargo("Faxineiro");
        
        System.out.println("\t - Dados do Funcionario: " + f1.nome + "-\n");
        System.out.println(f1.retornaDados());
    }
    
}
