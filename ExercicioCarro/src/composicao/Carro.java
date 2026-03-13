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
    public Pneu[] pneus;
    
    public Carro() {
        this.motor = new Motor();
        this.bateria = new Bateria();
        this.portas = new Porta();
        pneus = new Pneu[4];
        pneus[0] = new Pneu();
        pneus[1] = new Pneu();
        pneus[2] = new Pneu();
        pneus[3] = new Pneu();
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
                Pneus:
                
                %s
                """, marca, modelo, placa, qtdLugares, ano, velocidade, peso, motor.toString(), bateria.toString(), getPneus());
    }
    
    private String getPneus() {
        String temp = "";
        
        for(int i = 0; i < pneus.length; i++) {
            temp += "Pneu #" + (i + 1) + ":\n";
            temp += pneus[i].toString();
        }
        
        return temp;
    }
    
}
