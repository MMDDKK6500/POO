package br.senac.prj.view;

import br.senac.prj.model.Divisao;
import br.senac.prj.model.Multiplicacao;
import br.senac.prj.model.Soma;
import br.senac.prj.model.Subtracao;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o primeiro número?");
        int n1 = sc.nextInt();
        
        System.out.println("Qual o segundo número?");
        int n2 = sc.nextInt();
        
        Soma sm = new Soma(n1, n2);
        Subtracao sb = new Subtracao(n1, n2);
        Multiplicacao mp = new Multiplicacao(n1, n2);
        Divisao dv = new Divisao(n1, n2);
        
        System.out.println("Soma: " + sm.Somar());
        System.out.println("Subtração: " + sb.Subtrair());
        System.out.println("Multiplicação: " + mp.Multiplicar());
        System.out.println("Divisão: " + dv.Dividir());
    }
    
}
