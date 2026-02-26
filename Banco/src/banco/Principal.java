package banco;

public class Principal {

    public static void main(String[] args) {
        Conta C1 = new Conta("Pedro");
        
        System.out.println(C1.toString());
        
        if (!C1.sacar(100)) System.out.println("Erro: Saldo e Limite insuficiente para transação ser completa.");
        
        System.out.println(C1.toString());
        
        C1.colocarLimiteConta(400);
        
        if (!C1.sacar(300)) System.out.println("Erro: Saldo e Limite insuficiente para transação ser completa.");
        
        System.out.println(C1.toString());
        
        if (!C1.sacar(300)) System.out.println("Erro: Saldo e Limite insuficiente para transação ser completa.");
        
        System.out.println(C1.toString());
        
    }
    
}
