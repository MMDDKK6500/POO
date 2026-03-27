package heranca;


public class Principal {


    public static void main(String[] args) {
        Aluno al = new Aluno();
        Professor p1 = new Professor();

        al.nome = "Petrucio das Oliveiras";
        al.rg = "36.456.789-X";
        al.cpf = "456.123.789-89";
        al.registroAluno = 987987987;
        al.notaVestibular = 7.5f;
        al.curso = "Bacharelado em Artes Marciais";
        al.dataMatricula = "02/02/2022";

        p1.nome = "Tibúrcio Yoda";
        p1.rg = "27.189.654-7";
        p1.cpf= "777.888.999-10";
        p1.matriculaProfessor = 300468;
        p1.dataAdmissao = "10/10/2019";
        p1.salarioHorista = 70.99;
        //Imprimindo os dados do Aluno al
        System.out.println("\t Dados do Aluno RA nº: " + al.registroAluno + "\n");
        System.out.println(al.retornaDados());
    }
    
}
