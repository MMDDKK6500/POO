package banco;

import java.util.Date;
import java.util.Random;

public class Conta {
    
    private int numeroConta;
    private String nomeCliente;
    private Date dataAbertura;
    private double saldo;
    private double limiteConta;
    
    private static final Random rand = new Random(); 
    
    public Conta(String nome) {
        this.nomeCliente = nome;
        this.numeroConta = rand.nextInt(Integer.MAX_VALUE - 1) + 1;
        this.dataAbertura = new Date();
        this.saldo = 200;
    }

    public int verNumeroConta() {
        return numeroConta;
    }

    public String verNomeCliente() {
        return nomeCliente;
    }

    public Date verDataAbertura() {
        return dataAbertura;
    }

    public double verLimiteConta() {
        return limiteConta;
    }

    public void colocarLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }
    
    public double verSaldo() {
        return this.saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public boolean sacar(double valor) {
        // Verificar se conta tem saldo e limite suficiente
        if ((this.saldo - valor) > 0.0 || Math.abs(saldo - valor) < this.limiteConta) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", nomeCliente=" + nomeCliente + ", dataAbertura=" + dataAbertura + ", saldo=" + saldo + ", limiteConta=" + limiteConta + '}';
    }
    
    
    
}
