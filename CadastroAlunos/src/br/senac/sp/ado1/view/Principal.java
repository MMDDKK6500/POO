package br.senac.sp.ado1.view;

// Trabalho feito por João Duque e Felipe Camargo

import br.senac.sp.ado1.model.Aluno;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos;
        
        int escolha = 0;
        
        System.out.println("Quantos alunos cadastrar?");
        int tamanho = sc.nextInt();
        sc.nextLine();
        alunos = new Aluno[tamanho];
        
        do {
            
            System.out.println("\nQual opção você deseja escolher?");
            System.out.println("Alunos para cadastrar: " + (tamanho - pegarQuantidadeAlunos(alunos)));
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Sair");
            
            escolha = sc.nextInt();
            sc.nextLine();
            
            switch (escolha) {
                
                case 1 -> {
                    if (pegarQuantidadeAlunos(alunos) >= tamanho) {
                        System.out.println("Limite de alunos chegado!");
                        break;
                    }
                    
                    Aluno aluno = new Aluno();
                    
                    System.out.println("Qual o id do aluno?");
                    aluno.setId(sc.nextInt());
                    sc.nextLine();
                    
                    System.out.println("Qual o nome do aluno?");
                    aluno.setNomeAluno(sc.nextLine());
                    
                    System.out.println("Qual o telefone do aluno?");
                    aluno.setNumeroTelefone(sc.nextLine());
                    
                    
                    alunos[pegarQuantidadeAlunos(alunos)] = aluno;
                    
                }
                
                case 2 -> {
                    
                    if (pegarQuantidadeAlunos(alunos) == 0) {
                        System.out.println("Nenhum aluno cadastrado!");
                        break;
                    }
                    
                    for (int i = 0; i < pegarQuantidadeAlunos(alunos); i++) {
                        System.out.println("");
                        System.out.println("Aluno #" + (i + 1) + ":");
                        System.out.println(alunos[i].toString());
                    }
                    
                }
                
                case 3 -> System.exit(0);
                
            }
            
            escolha = 0;
            
        } while (escolha == 0);
        
    }
    
    private static int pegarQuantidadeAlunos(Aluno[] alunos) {
        int total = 0;
        
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) total++;
        }
        
        return total;
    }
    
}
