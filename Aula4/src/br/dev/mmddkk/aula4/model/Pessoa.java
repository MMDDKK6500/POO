package br.dev.mmddkk.aula4.model;

public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    private Endereco[] ends;
    
    public Pessoa() {
        this.ends = new Endereco[1];
    }
    
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        
        this.ends = new Endereco[1];
    }
    
    public Pessoa(String nome, int idade, char sexo, Endereco[] ends) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        
        this.ends = ends;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco[] getEnds() {
        return ends;
    }

    public void setEnds(Endereco[] ends) {
        this.ends = ends;
    }

    @Override
    public String toString() {
        String dados = "";
        
        dados += "Nome: " + this.nome + "\nIdade: " + this.idade + "\nSexo: " + this.sexo + "\n";
        for (int i = 0; i < this.ends.length; i++) {
            dados += "Endereço #" + (i+1) + ":" + this.ends[i].toString();
        }
        
        return dados;
    }
    
    
}
