package campeonato;

import java.util.Random;

public class Jogo {
    private Time desafiado;
    private Time desafiante;
    
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
            int vencedor = rd.nextInt(3);
            
            System.out.println("---------- Resultado do Jogo ----------");
            switch (vencedor) {
                case 0: 
                    System.out.println("--> Empate");
                    this.desafiado.empatarJogo();
                    this.desafiante.empatarJogo();
                    break;
                    
                case 1:
                    System.out.println("Ganhou: " + this.desafiado.getNome());
                    this.desafiado.ganharJogo();
                    this.desafiante.perderJogo();
                    break;
                    
                case 2:
                    System.out.println("Ganhou: " + this.desafiante.getNome());
                    this.desafiante.ganharJogo();
                    this.desafiado.perderJogo();
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
