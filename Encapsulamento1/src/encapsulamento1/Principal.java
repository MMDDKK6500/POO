package encapsulamento1;

public class Principal {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        
        String nome = "Pedrinho";
        int idade = 21;
        
        a1.setNome(nome);
        a1.setIdade(idade);
        
        System.out.printf("Nome: %s\nIdade: %d\n", a1.getNome(), a1.getIdade());
        
    }
    
}
