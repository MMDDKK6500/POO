package encapsulamento1;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Aluno a1 = new Aluno();
        
        System.out.println("Qual será o nome?");
        String nome = sc.nextLine();
        
        System.out.println("Qual será a idade?");
        int idade = sc.nextInt();
        
        a1.setNome(nome);
        a1.setIdade(idade);
        
        System.out.printf("Nome: %s\nIdade: %d\n", a1.getNome(), a1.getIdade());
        
    }
    
}
