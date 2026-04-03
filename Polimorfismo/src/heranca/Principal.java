package heranca;

public class Principal {
    
    public static void main(String[] args) {
//        Aluno a1 = new Aluno();
//        Professor p1 = new Professor();
//        
//        a1.nome = "Petrucio das Oliveiras";
//        a1.rg = "36.456.789-x";
//        a1.cpf = "456.123.789-89";
//        a1.registroAluno = 987987987;
//        a1.notaVestibular = 7.5f;
//        a1.curso = "Bacharelado em Artes Marciais";
//        a1.dataMatricula = "02/02/2023";
//        
//        p1.nome = "Tibúrcio Yoda";
//        p1.rg = "27.189.654-7";
//        p1.cpf = "777.888.999-10";
//        p1.matriculaProfessor = 300468;
//        p1.dataAdmissao = "10/10/2017";
//        p1.salarioHorista = 70.99;
        Aluno a1 = new Aluno("Petrucio das Oliveiras", "36.456.789-X", "456.123.789-89",
            987987987, 7.5f, "Bacharelado em Artes Marciais", "02/02/2022");
        
        System.out.println("\t Dados do Aluno RA nº: " + a1.registroAluno + " - \n");
        System.out.println(a1.retornaDados());
    }
}
