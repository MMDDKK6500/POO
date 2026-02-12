package salarioliquido;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o salário bruto?");
        double sb = sc.nextDouble();
        
        System.out.println("Quantidade dos descontos:");
        double dc = sc.nextDouble();
        
        CalcularSalario cs = new CalcularSalario(sb, dc);
        
        System.out.println("Salário Bruto: " + sb);
        System.out.println("Descontos: " + dc);
        System.out.println("Salário Líquido: " + cs.Calcular());
        
    }
    
}
