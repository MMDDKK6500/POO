package campeonato;

public class Time {
    
    private String nome;
    private String cidade;
    private String uf;
    private int anoFundacao;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int qtdJogadores;
    
    public Time(String nome, String cidade, String uf, int anoFundacao, int vitorias, int derrotas, int empates, int qtdJogadores) {
        this.nome = nome;
        this.cidade = cidade;
        this.uf = uf;
        this.anoFundacao = anoFundacao;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.qtdJogadores = qtdJogadores;
    }
    
    public String apresentar() {
        return String.format(
                """
                XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                SALVE AMIGOS DO CAMPEONATO VARZEANO!
                O grande time %s
                Diretamente de %s, %s
                Fundado no ano de %s
                Vitórias: %d
                Derrotas: %d
                Empates: %d
                XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                """,
                this.nome, this.cidade, this.uf, this.anoFundacao, this.vitorias, this.derrotas, this.empates);
    }
    
    public String status() {
        return String.format(
                """
                ****************************************************
                Time: %s
                Vitórias: %d
                Derrotas: %d
                Empates: %d
                *****************************************************
                """,
                this.nome, this.vitorias, this.derrotas, this.empates);
    }
    
    public void ganharJogo() {
        this.vitorias++;
    }
    
    public void perderJogo() {
        this.derrotas++;
    }
    
    public void empatarJogo() {
        this.empates++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public void setQtdJogadores(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }
}
