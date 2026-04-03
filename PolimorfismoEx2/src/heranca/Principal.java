package heranca;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int qtdAlunos = 0;
        int qtdProf = 0;
        
        System.out.println("Quantos alunos cadastrar?");
        
        qtdAlunos = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Quantos professores cadastrar?");
        
        qtdProf = sc.nextInt();
        sc.nextLine();
        
        Aluno[] alunos = new Aluno[qtdAlunos];
        Professor[] professores = new Professor[qtdProf];
        
        for (int i = 0; i < qtdAlunos; i++) {
            alunos[i] = new Aluno();
            
            System.out.println("Qual o nome do " + (i + 1) + "º aluno?");
            alunos[i].nome = sc.nextLine();
            
            System.out.println("Qual o RG do " + (i + 1) + "º aluno?");
            alunos[i].rg = sc.nextLine();
            
            System.out.println("Qual o CPF do " + (i + 1) + "º aluno?");
            alunos[i].cpf = sc.nextLine();
            
            System.out.println("Qual o registro do " + (i + 1) + "º aluno?");
            alunos[i].registroAluno = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Qual a nota de vestibular o nome do " + (i + 1) + "º aluno?");
            alunos[i].notaVestibular = sc.nextFloat();
            sc.nextLine();
            
            System.out.println("Qual o curso do " + (i + 1) + "º aluno?");
            alunos[i].curso = sc.nextLine();
            
            System.out.println("Qual a data de matrícula do " + (i + 1) + "º aluno?");
            alunos[i].dataMatricula = sc.nextLine();
        }
        
        for (int i = 0; i < qtdProf; i++) {
            professores[i] = new Professor();
            
            System.out.println("Qual o nome do " + (i + 1) + "º professor?");
            professores[i].nome = sc.nextLine();
            
            System.out.println("Qual o endereco do " + (i + 1) + "º professor?");
            professores[i].endereco = sc.nextLine();
            
            System.out.println("Qual a idade do " + (i + 1) + "º professor?");
            professores[i].idade = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Qual a matricula do " + (i + 1) + "º professor?");
            professores[i].matriculaProfessor = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Qual a data de admissão do " + (i + 1) + "º professor?");
            professores[i].dataAdmissao = sc.nextLine();
            
            System.out.println("Qual o salário mensal do " + (i + 1) + "º professor?");
            professores[i].salarioMensal = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Qual a matéria do " + (i + 1) + "º professor?");
            professores[i].materia = sc.nextLine();
            
        }
        
        while (true) {
            System.out.println("Qual opção você quer proseguir?");
            System.out.println("1 - Ver professores");
            System.out.println("2 - Ver alunos");
            System.out.println("3 - Sair");
            
            int escolha = sc.nextInt();
            sc.nextLine();
            
            switch(escolha) {
                
                case 1:
                    System.out.println("Qual professor ver?");
                    for (int i = 0; i < qtdProf; i++) {
                        System.out.println((i + 1) + " - " + professores[i].nome);
                    }
                    
                    int escolha2 = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println(professores[escolha2 - 1].retornaDados());
                    break;
                    
                case 2:
                    System.out.println("Qual aluno ver?");
                    for (int i = 0; i < qtdAlunos; i++) {
                        System.out.println((i + 1) + " - " + alunos[i].nome);
                    }
                    
                    int escolha3 = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println(professores[escolha3 - 1].retornaDados());
                    break;
                    
                case 3:
                default:
                    System.exit(0);
            }
        }
    }
}
