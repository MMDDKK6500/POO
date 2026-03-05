package br.dev.mmddkk.aula4;

public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    private Endereco end;
    
    public Pessoa() {
        this.end = new Endereco();
    }
    
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        
        this.end = new Endereco();
    }
    
    public Pessoa(String nome, int idade, char sexo, Endereco end) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        
        this.end = end;
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

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public String toString() {
        String dados = "";
        
        dados += "Nome: " + this.nome + "\nIdade: " + this.idade + "\nSexo: " + this.sexo + "\n";
        dados += "Endereço: " + this.end.toString();
        
        return dados;
    }
    
    
}
