package br.senacp.prj.view;

import br.senacp.prj.model.CalculoTriplo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x;
        
        System.out.println("Informe um número: ");
        x = sc.nextInt();
        
        CalculoTriplo ct = new CalculoTriplo(x);
    
        System.out.println("O triplo do número digitado: " + ct.Triplo());
    }
    
}
