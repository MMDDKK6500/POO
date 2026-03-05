package br.dev.mmddkk.aula4.view;

import java.util.Scanner;

import br.dev.mmddkk.aula4.model.*;

public class Principal {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        Endereco end = new Endereco();
        
        char resp;
        
        
        System.out.print("Informe o nome: ");
        p1.setNome(sc.nextLine());
        
        System.out.print("Digite a idade: ");
        p1.setIdade(sc.nextInt());
        
        System.out.print("Informe o Sexo(F/M): ");
        p1.setSexo(sc.next().charAt(0));
        sc.nextLine();
        
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
        
        p1.setEnd(end);
        
        System.out.println("\n\t\t - Dados da pessoa: -\n\n" + p1.toString());
        
        sc.close();
        
    }
    
}
