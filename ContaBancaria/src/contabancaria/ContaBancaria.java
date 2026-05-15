package contabancaria;

public class ContaBancaria {
        
    private double saldo = 1000.0;
    
    public void sacar(double valor) throws IllegalArgumentException {
        
        if (valor <= 0) {
            throw new IllegalArgumentException(
                "Apenas números inteiros e positivos!"
            );            
        }        
        
        if (valor > saldo) {
            throw new IllegalArgumentException(
                "Saldo insuficiente! Saldo: " + saldo + " | Solicitado: " + valor
            );
        }
        
        saldo -= valor;
    }
    
    public void depositar(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                "Apenas números inteiros e positivos!"
            );            
        }  
        
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
