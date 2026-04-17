package pacote;

public class Principal {

    public static void main(String[] args) {
       
        double numero = 45;
        Dobro dob = new Dobro();
        dob.setNum(numero);
        
        System.out.println("\nO dobro de " + dob.getNum() + " é: " + dob.calcularDobro());
    }
    
}
