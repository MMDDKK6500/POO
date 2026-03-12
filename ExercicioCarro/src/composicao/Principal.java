package composicao;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        
        Carro carro = new Carro();
        
        do {
            System.out.println("Qual opção você deseja escolher?");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Exibir Carro");
            System.out.println("3 - Sair");
            
            escolha = sc.nextInt();
            sc.nextLine();
            
                        switch (escolha) {

                case 1 -> {
                    System.out.println("\n\t - Informações do carro -");

                    System.out.println("Qual a marca do carro?");
                    carro.setMarca(sc.nextLine());

                    System.out.println("Qual o modelo do carro?");
                    carro.setModelo(sc.nextLine());

                    System.out.println("Qual a placa do carro?");
                    carro.setPlaca(sc.nextLine());

                    System.out.println("Qual a quantidade de lugares?");
                    carro.setQtdLugares(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Qual o ano do carro?");
                    carro.setAno(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Qual a velocidade do carro?");
                    carro.setVelocidade(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Qual o peso do carro?");
                    carro.setPeso(sc.nextDouble());
                    sc.nextLine();


                    System.out.println("\n\t - Informações do motor -");

                    System.out.println("Qual o modelo do motor?");
                    carro.motor.setModelo(sc.nextLine());

                    System.out.println("Qual a potencia do motor?");
                    carro.motor.setPotencia(sc.nextLine());

                    System.out.println("Qual o fabricante do motor?");
                    carro.motor.setFabricante(sc.nextLine());

                    System.out.println("Qual a quantidade de cilindros do motor?");
                    carro.motor.setQtdeCilindros(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Qual o volume do motor?");
                    carro.motor.setVolume(sc.nextFloat());
                    sc.nextLine();


                    System.out.println("\n\t - Informações da bateria -");

                    System.out.println("Qual o modelo da bateria?");
                    carro.bateria.setModelo(sc.nextLine());

                    System.out.println("Qual a carga da bateria?");
                    carro.bateria.setCarga(sc.nextLine());

                    System.out.println("Qual o fabricante da bateria?");
                    carro.bateria.setFabricante(sc.nextLine());

                    System.out.println("Qual o ano de fabricação?");
                    carro.bateria.setAnoFabricacao(sc.nextInt());
                    sc.nextLine();

                    System.out.println("\n\n\t - Carro cadastrado -");
                    System.out.println(carro.toString());
                    
                    escolha = 0;
                    
                }

                case 2 -> {
                    System.out.println(carro.toString());
                    escolha = 0;
                }

            }
            
            
                        
        } while (escolha == 0);
        

        
    }
    
}
