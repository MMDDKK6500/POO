package classeabstrata;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalAbstrata {

    public static void main(String[] args) {
        
//        Aluno a1 = new Aluno();
//        
//        a1.setNome("Petrucio das Oliveiras");
//        a1.setRg("36.456.789-X");
//        a1.setCpf("456.123.789-89");
//        a1.setRegistroDoAluno("2443532");
//        a1.setDataMatricula("06/02/2022");
//        a1.setNotaVestibular(780);
//        a1.setCurso("BSI");
//        
//        System.out.println("\t - Dados do Aluno: " + a1.getNome() + "-\n");
//        System.out.println(a1.retornaDados());
//        
//        Funcionario f1 = new Funcionario();
//        f1.setNome("Heitor Dumas");
//        f1.setRg("36.456.789-X");
//        f1.setCpf("456.123.789-89");
//        f1.setDepartamento("Limpeza e Manutenção");
//        f1.setId("152");
//        f1.setCargo("Faxineiro");
//        
//        System.out.println("\t - Dados do Funcionario: " + f1.getNome() + "-\n");
//        System.out.println(f1.retornaDados());
//        
//        Professor p1 = new Professor();
//        p1.setNome("Cecilia Garras");
//        p1.setRg("36.456.789-X");
//        p1.setCpf("456.123.789-89");
//        p1.setDepartamento("Aprendizado");
//        p1.setId("15232");
//        p1.setCargo("Professor Substituto");
//        p1.setMateria("Matemática");
//        p1.setTurma("8º Ano A");
//        
//        System.out.println("\t - Dados do Professor: " + p1.getNome() + "-\n");
//        System.out.println(p1.retornaDados());
    

    //INCOMPLETO


        Scanner sc = new Scanner(System.in);
        
        ArrayList<Aluno> alunos = new ArrayList();
        ArrayList<Funcionario> funcionarios = new ArrayList();
        ArrayList<Professor> professores = new ArrayList();
        
        while (true) {
            System.out.println("""
                               1 - Adicionar um aluno 
                               2 - Adicionar um funcionário
                               3 - Adicionar um professor
                               4 - Sair
                               """);
            
            int escolha = sc.nextInt();
            sc.nextLine();
            
            switch (escolha) {
                case 1 -> {
                    Aluno a = new Aluno();
                    
                    System.out.println("Qual o nome do aluno?");
                    a.setNome(sc.nextLine());
                    
                    System.out.println("Qual o RG do aluno?");
                    a.setRg(sc.nextLine());
                    
                    System.out.println("Qual o CPF do aluno?");
                    a.setCpf(sc.nextLine());
                    
                    System.out.println("Qual o Registro do aluno?");
                    a.setRegistroDoAluno(sc.nextLine());
                    
                    System.out.println("Qual a data de matrícula do aluno?");
                    a.setDataMatricula(sc.nextLine());
                    
                    System.out.println("Qual a nota do vestibular do aluno?");
                    a.setNotaVestibular(sc.nextDouble());
                    
                    System.out.println("Qual o curso do aluno?");
                    a.setCurso(sc.nextLine());
                    
                    alunos.add(a);
                }
                
                case 2 -> {
                    Funcionario f = new Funcionario();
                    
                    System.out.println("Qual o nome do funcionario?");
                    f.setNome(sc.nextLine());
                    
                    System.out.println("Qual o RG do funcionario?");
                    f.setRg(sc.nextLine());
                    
                    System.out.println("Qual o CPF do funcionario?");
                    f.setCpf(sc.nextLine());
                    
                    System.out.println("Qual o Departamento do funcionario?");
                    f.setDepartamento(sc.nextLine());
                    
                    System.out.println("Qual o cargo do funcionario?");
                    f.setCargo(sc.nextLine());
                    
                    System.out.println("Qual o número do crachá do funcionário?");
                    f.setId(sc.nextLine());
                    
                    funcionarios.add(f);
                }
            }
        }
        
    }
    
}
