package composicao;

public class Carro {
    
    private String marca;
    private String modelo;
    private String placa;
    private int qtdLugares;
    private int ano;
    private double velocidade;
    private double peso;
    
    public Motor motor;
    public Bateria bateria;
    public Porta portas;
    
    public Carro() {
        this.motor = new Motor();
        this.bateria = new Bateria();
        this.portas = new Porta();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        //return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", qtdLugares=" + qtdLugares + ", ano=" + ano + ", velocidade=" + velocidade + ", peso=" + peso + ", motor=" + motor + ", bateria=" + bateria + ", portas=" + portas + '}';
        
        return String.format(
                """
                Carro: 
                \tMarca: %s 
                \tModelo: %s 
                \tPlaca: %s 
                \tQuantidade de lugares: %d 
                \tAno de fabricação: %d 
                \tVelocidade: %.2f 
                \tPeso: %.2f
                %s
                %s
                """, marca, modelo, placa, qtdLugares, ano, velocidade, peso, motor.toString(), bateria.toString());
    }
    
    
    
}
