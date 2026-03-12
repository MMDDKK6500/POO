package composicao;

public class Principal {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        
        carro.motor.potencia = "2.900cc";
        carro.modelo = "BMW 525i";
        
        carro.portas.abrir();
        System.out.println(carro.motor.potencia);
        System.out.println(carro.modelo);
        
    }
    
}
