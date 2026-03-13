package br.dev.mmddkk.exerciciolivraria.model;

public class Livraria {
    
    private Livro[] livros;
    private String nome;
    private String endereco;
    private Funcionario[] funcionarios;

    public Livraria(int qtdLivros, int qtdFuncionarios) {
        this.livros = new Livro[qtdLivros];
        this.funcionarios = new Funcionario[qtdFuncionarios];
    }
    
    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        //return "Livraria{" + "livros=" + livros + ", nome=" + nome + ", endereco=" + endereco + ", funcionarios=" + funcionarios + '}';
        return  String.format(
                """
                Nome: %s
                Endereço: %s
                Funcionarios:
                %s
                Livros:
                %s
                """,
                nome, endereco, listFuncionarios(), listLivros());
    }
    
    public String listFuncionarios() {
        String temp = "";
        
        for(int i = 0; i < funcionarios.length; i++) {
            temp += "\tFuncionario #" + (i + 1) + ":\n";
            temp += funcionarios[i].toString();
        }
        
        return temp;
    }
    
    public String listLivros() {
        String temp = "";
        
        for(int i = 0; i < livros.length; i++) {
            temp += "\tLivro #" + (i + 1) + ":\n";
            temp += livros[i].toString();
        }
        
        return temp;
    }
 
    
    
}
