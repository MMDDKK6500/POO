package composicao;

public class Carro {
    
    String marca;
    String modelo;
    String placa;
    int qtdLugares;
    
    public Carro() {
        this.motor = new Motor();
        this.bateria = new Bateria();
        this.portas = new Porta();
    }
    
    Motor motor;
    Bateria bateria;
    Porta portas;
    
}
