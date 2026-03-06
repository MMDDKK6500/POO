package br.dev.mmddkk.aula4.view;

import java.util.Scanner;

import br.dev.mmddkk.aula4.model.*;

public class Principal {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        Pessoa p1;
        Endereco[] ends;
        
        char resp;
        String nome;
        int idade;
        char sexo;
        int qntEnd;
        
        
        System.out.print("Informe o nome: ");
        nome = sc.nextLine();
        
        System.out.print("Digite a idade: ");
        idade = sc.nextInt();
        
        System.out.print("Informe o Sexo(F/M): ");
        sexo = sc.next().charAt(0);
        sc.nextLine();
        
        System.out.println("Quantos endereços tem? ");
        qntEnd = sc.nextInt();
        sc.nextLine();
        
        ends = new Endereco[qntEnd];
        
        p1 = new Pessoa(nome, idade, sexo);
        
        for (int i = 0; i < qntEnd; i++) {
            Endereco end = new Endereco();
            
            System.out.print("Informe o logradouro: ");
            end.setLogradouro(sc.nextLine());

            System.out.print("Digite o número: ");
            end.setNumero(sc.nextInt());
            sc.nextLine();

            System.out.print("Tem complemento? [S/N]");
            resp = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            if (resp == 's') {
                System.out.print("Informe o complemento: ");
                end.setComplemento(sc.nextLine());
            } else {
                end.setComplemento("");
            }

            System.out.print("Digite o CEP: ");
            end.setCEP(sc.nextLine());
            
            ends[i] = end;
            
        }
        
        p1.setEnds(ends);
        
        System.out.println("\n\t\t - Dados da pessoa: -\n\n" + p1.toString());
        
        sc.close();
        
    }
    
}
