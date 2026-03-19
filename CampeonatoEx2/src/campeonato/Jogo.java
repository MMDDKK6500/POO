package campeonato;

import java.util.Random;

public class Jogo {
    private Time desafiado;
    private Time desafiante;
    private int golDesafiante;
    private int golDesafiado;
    
    private boolean aprovado;
    
    public void marcarJogo(Time t1, Time t2) {
        if ((t1.getQtdJogadores() >= 9 && t2.getQtdJogadores() >= 9) && t1 != t2) {
            this.aprovado = true;
            this.desafiado = t1;
            this.desafiante = t2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Jogo Anulado!");
        }
    }
    
    public void jogar() {
        if (this.aprovado) {
            System.out.println("### Time da CASA");
            System.out.println(this.desafiado.apresentar());
            System.out.println("### Time VISITANTE");
            System.out.println(this.desafiante.apresentar());
            
            Random rd = new Random();
            this.golDesafiante = rd.nextInt(7);
            this.golDesafiado = rd.nextInt(7);
            
            System.out.println("---------- Resultado do Jogo ----------");
            if (golDesafiante > golDesafiado) {
                    System.out.println("Ganhou: " + this.desafiante.getNome());
                    System.out.printf("%s %d x %d %s\n", this.desafiante.getNome(), this.golDesafiante, this.golDesafiado, this.desafiado.getNome());
                    this.desafiante.ganharJogo();
                    this.desafiado.perderJogo();
            } else if (golDesafiado > golDesafiante) {
                    System.out.println("Ganhou: " + this.desafiado.getNome());
                    System.out.printf("%s %d x %d %s\n", this.desafiado.getNome(), this.golDesafiado, this.golDesafiante, this.desafiante.getNome());
                    this.desafiado.ganharJogo();
                    this.desafiante.perderJogo();
            } else {
                    System.out.println("Empate");
                    System.out.printf("%s %d x %d %s\n", this.desafiante.getNome(), this.golDesafiante, this.golDesafiado, this.desafiado.getNome());
                    this.desafiado.empatarJogo();
                    this.desafiante.empatarJogo();
            }
            System.out.println("--------------------------------------");
        }
    }

    public Time getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Time desafiado) {
        this.desafiado = desafiado;
    }

    public Time getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Time desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
