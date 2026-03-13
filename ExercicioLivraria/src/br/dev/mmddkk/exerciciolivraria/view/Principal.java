package br.dev.mmddkk.exerciciolivraria.view;

import br.dev.mmddkk.exerciciolivraria.model.Livro;
import br.dev.mmddkk.exerciciolivraria.model.Funcionario;
import br.dev.mmddkk.exerciciolivraria.model.Livraria;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int qtdLivros;
        int qtdFuncionario;
        
        System.out.println("Quantos livros cadastrar?");
        qtdLivros = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Quantos funcionarios cadastrar?");
        qtdFuncionario = sc.nextInt();
        sc.nextLine();
        
        Livraria livraria = new Livraria(qtdLivros, qtdFuncionario);
        
        System.out.println("Qual o nome da livraria?");
        livraria.setNome(sc.nextLine());
        
        System.out.println("Qual o endereço da livraria?");
        livraria.setEndereco(sc.nextLine());
        
        for (int i = 0; i < livraria.getFuncionarios().length; i++) {
            livraria.getFuncionarios()[i] = new Funcionario();
            System.out.println("Qual o nome do " + (i + 1) + "º funcionario?");
            livraria.getFuncionarios()[i].setNome(sc.nextLine());
            
            System.out.println("Qual o id do " + (i + 1) + "º funcionario?");
            livraria.getFuncionarios()[i].setId(sc.nextInt());
            sc.nextLine();
            
            System.out.println("Qual o cargo do " + (i + 1) + "º funcionario?");
            livraria.getFuncionarios()[i].setCargo(sc.nextLine());            
            
        }
        
        for (int i = 0; i < livraria.getLivros().length; i++) {
            livraria.getLivros()[i] = new Livro();
            System.out.println("Qual o nome do " + (i + 1) + "º livro?");
            livraria.getLivros()[i].setNome(sc.nextLine());
            
            System.out.println("Qual o autor do " + (i + 1) + "º livro?");
            livraria.getLivros()[i].setAutor(sc.nextLine());
            
            System.out.println("Quantas paginas tem o " + (i + 1) + "º livro?");
            livraria.getLivros()[i].setQtdPaginas(sc.nextInt());
            sc.nextLine();
        }
        
        System.out.println("Livraria adicionada!\n");
        
        System.out.println(livraria.toString());
        
    }
    
}
