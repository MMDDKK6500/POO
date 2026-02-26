package boletim;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        float nota;
        int frequencia;
        String status;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual foi a nota?");
        nota = sc.nextFloat();
        
        System.out.println("Qual foi a frequencia?");
        frequencia = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Qual é o status?");
        status = sc.nextLine();
        
        Boletim B1;
        B1 = new Boletim(nota, frequencia, status);
        B1.imprimir();
        
    }
    
}
