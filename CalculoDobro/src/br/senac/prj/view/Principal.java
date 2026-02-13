package br.senac.prj.view;

import br.senac.prj.model.CalculoDobro;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x;
        
        System.out.println("Informe um número: ");
        x = sc.nextInt();
        
        CalculoDobro cd = new CalculoDobro(x);
    
        System.out.println("O dobro do número digitado é: " + cd.Dobro());
    }
    
}
