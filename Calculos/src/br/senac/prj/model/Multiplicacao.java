package br.senac.prj.model;

public class Multiplicacao {

    int n1;
    int n2;
    
    public Multiplicacao(int N1, int N2) {
        n1 = N1;
        n2 = N2;
    }
    
    
    public int Multiplicar() {
        return n1 * n2;
    }
}
