package contabancaria;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        
        while (true) {
            int escolha = 4;
            try {
                // Assim ele fica bugado mas vida q segue
                try {
                    escolha = Integer.parseInt(JOptionPane.showInputDialog(
                            """
                            Qual opção deseja fazer?                  

                            1 - Sacar
                            2 - Depositar
                            3 - Ver saldo

                            4 - Sair
                            """));
                } catch (NumberFormatException e) {
                    if (escolha == 4) {
                        System.exit(0);
                    }
                    JOptionPane.showMessageDialog(null, "Apenas números!");
                    continue;
                }
                
                if (escolha < 1 || escolha > 4) {
                    throw new InputMismatchException();
                }
                
            } catch (InputMismatchException e) {
                    JOptionPane.showMessageDialog(null, "Escolha apenas as opções disponíveis!");
                    continue;
            }
            
            if (escolha == 4) {
                System.exit(0);
            }
            
            switch (escolha) {
                case 1 -> {
                    
                    double valor = -1.0;
                    
                    try {
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto sacar?"));
                    } catch (NumberFormatException | NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "Apenas números!");
                        continue;
                    }
                    try {
                        conta.sacar(valor);
                    } catch(IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        continue;
                    } 
                    
                    System.out.printf("Valor sacado: %.2f\nNovo saldo: %.2f\n", valor, conta.getSaldo());
                }
                
                case 2 -> {
                    double valor = -1.0;
                    
                    try {
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto depositar?"));
                    } catch (NumberFormatException | NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "Apenas números!");
                        continue;
                    }
                    
                    try {
                        conta.depositar(valor);
                    } catch(IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        continue;
                    } 
                    
                    System.out.printf("Valor depositado: %.2f\nNovo saldo: %.2f\n", valor, conta.getSaldo());
                }
                
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Saldo: " + conta.getSaldo());
                }
            }
        }
    }
}
