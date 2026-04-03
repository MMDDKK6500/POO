package heranca;

public class Principal {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Petrucio das Oliveiras", "36.456.789-X", "456.123.789-89",
            987987987, 7.5f, "Bacharelado em Artes Marciais", "02/02/2022");
        
        System.out.println("\t Dados do Aluno RA nº: " + a1.registroAluno + " - \n");
        System.out.println(a1.retornaDados());
    }
}
