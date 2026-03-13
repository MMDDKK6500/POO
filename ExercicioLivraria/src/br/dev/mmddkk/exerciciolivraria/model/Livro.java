package br.dev.mmddkk.exerciciolivraria.model;

public class Livro {
    private String nome;
    private String autor;
    private int qtdPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    @Override
    public String toString() {
        //return "Livro{" + "nome=" + nome + ", autor=" + autor + ", qtdPaginas=" + qtdPaginas + '}';
        return  String.format(
                """
                \t\tNome: %s
                \t\tAutor: %s
                \t\tQuantidade de pagina: %s
                """,
                nome, autor, qtdPaginas);
    }
    
    
    
}
