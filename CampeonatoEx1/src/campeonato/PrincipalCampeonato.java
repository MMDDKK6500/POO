package campeonato;

import java.util.Scanner;

public class PrincipalCampeonato {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Time t[];
        
        System.out.println("Quantos times neste campeonato?");
        int qtd = sc.nextInt();
        sc.nextLine();
        
        t = new Time[qtd];
        
        for (int i = 0; i < t.length; i++) {
            t[i] = new Time();
            
            System.out.println("Qual o nome do " + (i + 1) +  " time?");
            t[i].setNome(sc.nextLine());
            
            System.out.println("Qual a cidade do " + (i + 1) +  " time?");
            t[i].setCidade(sc.nextLine());
            
            System.out.println("Qual o UF do " + (i + 1) +  "time");
            t[i].setUf(sc.nextLine());
            
            System.out.println("Qual o ano de fundação do " + (i + 1) +  "time");
            t[i].setAnoFundacao(sc.nextInt());
            sc.nextLine();
            
            System.out.println("Quantos jogadores tem no " + (i + 1) +  "time");
            t[i].setQtdJogadores(sc.nextInt());
            sc.nextLine();
        }
        
        int escolha = 0;
        
        do {
            
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Ver status de um time");
            System.out.println("2 - Ver apresentação de um time");
            System.out.println("3 - Fazer um jogo");
            System.out.println("4 - Sair");
            escolha = sc.nextInt();
            sc.nextLine();
            
            switch (escolha) {
                case 1:
                    System.out.println("Ver status de qual time?");
                    for (int i = 0; i < t.length; i++) {
                        System.out.println((i + 1) + " - " + t[i].getNome());
                    }
                    escolha = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println(t[escolha].status());
                    escolha = 0;
                    break;
                    
                case 2:
                    System.out.println("Apresentar qual time?");
                    for (int i = 0; i < t.length; i++) {
                        System.out.println((i + 1) + " - " + t[i].getNome());
                    }
                    escolha = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println(t[escolha].apresentar());
                    escolha = 0;
                    break;
                    
                case 3:
                    System.out.println("Qual time será o desafiante?");
                    for (int i = 0; i < t.length; i++) {
                        System.out.println((i + 1) + " - " + t[i].getNome());
                    }
                    int escolha1 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Qual time será o desafiado?");
                    for (int i = 0; i < t.length; i++) {
                        System.out.println((i + 1) + " - " + t[i].getNome());
                    }
                    int escolha2 = sc.nextInt();
                    sc.nextLine();

                    Jogo jg = new Jogo();
                    
                    jg.marcarJogo(t[escolha2 - 1], t[escolha1 - 1]);
                    
                    jg.jogar();
                    
                    escolha = 0;
                    break;
                    
                case 4:
                    System.exit(0);
            }
            
        } while(escolha == 0);
        
    }
    
}
