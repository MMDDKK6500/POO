package br.senac.prj.model;

public class Divisao {

    int n1;
    int n2;
    
    public Divisao(int N1, int N2) {
        n1 = N1;
        n2 = N2;
    }
    
    
    public int Dividir() {
        return n1 / n2;
    }
}
