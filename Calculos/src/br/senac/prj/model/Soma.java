package br.senac.prj.model;

public class Soma {

    int n1;
    int n2;
    
    public Soma(int N1, int N2) {
        n1 = N1;
        n2 = N2;
    }
    
    
    public int Somar() {
        return n1 + n2;
    }
}
