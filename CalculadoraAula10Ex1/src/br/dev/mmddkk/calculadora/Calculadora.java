package br.dev.mmddkk.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora do duque\n");
        
        while (true) {
            System.out.println("Qual operação quer fazer?");
            System.out.println("""
                               1 - Somar
                               2 - Subtrair
                               3 - Multiplicar
                               4 - Dividir
                               5 - Quadrado
                               
                               6 - Sair
                               """);
            
            System.out.print("Escolha: ");
            
            int escolha = 0;
            try {
                // Assim ele fica bugado mas vida q segue
                // Desbuguei eba
                escolha = sc.nextInt();
                
                if (escolha < 1 || escolha > 6) {
                    throw new InputMismatchException();
                }
                
                sc.nextLine(); // Comer enter normalmente
            } catch (InputMismatchException e) {
                System.out.println("\nExceção: " + e);
                System.out.println("Escolha apenas as opções demonstradas!");
                System.out.println("Aperte qualquer tecla para coninuar...");
                sc.nextLine(); // Comer enter caso exceção         
                sc.nextLine();           
                continue;
            }
            
            if (escolha == 6) {
                System.exit(0);
            }
            
            double num1, num2 = 0.0;
            try {
                if (escolha == 5) {
                    System.out.print("Qual será o número: ");
                    num1 = sc.nextDouble();  
                    sc.nextLine();
                    
                } else {
                    System.out.print("Qual será o primeiro número: ");
                    num1 = sc.nextDouble();
                    sc.nextLine();
                
                    System.out.print("Qual será o segundo número: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0 && escolha == 4) {
                        throw new IllegalArgumentException();
                    }
                    sc.nextLine();
                }
                
            } catch (InputMismatchException e) {
                System.out.println("\nExceção: " + e);
                System.out.println("Apenas números reais!");
                System.out.println("Aperte qualquer tecla para coninuar...");
                sc.nextLine();                
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("\nExceção: " + e);
                System.out.println("Impossível dividir por 0!");
                System.out.println("Aperte qualquer tecla para coninuar...");
                sc.nextLine();
                continue;
            }
            
            Calculos calc = new Calculos();
            
            calc.setNum1(num1);
            calc.setNum2(num2);
            
            System.out.println("");
            
            switch(escolha) {
                case 1 -> {
                    System.out.printf("A soma de %.2f e %.2f é:\n", num1, num2);
                    System.out.println(calc.somar());
                }
                
                case 2 -> {
                    System.out.printf("A subtração de %.2f e %.2f é:\n", num1, num2);
                    System.out.println(calc.subtrair());
                }
                
                case 3 -> {
                    System.out.printf("A multiplicação de %.2f por %.2f é:\n", num1, num2);
                    System.out.println(calc.multiplicar());
                }
                
                case 4 -> {
                    System.out.printf("A divisão de %.2f por %.2f é:\n", num1, num2);
                    System.out.println(calc.dividir());
                }
                
                case 5 -> {
                    System.out.printf("O quadrado de %.2f é:\n", num1);
                    System.out.println(calc.quadrado());
                }
                
                case 6 -> {
                    System.exit(0);
                }
            }
            
            System.out.println("\nAperte qualquer tecla para coninuar...");
            sc.nextLine();
            
        }
        
    }
    
}
