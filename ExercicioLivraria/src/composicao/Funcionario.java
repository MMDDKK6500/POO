package composicao;

public class Funcionario {
    private String nome;
    private String cargo;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        //return "Funcionario{" + "nome=" + nome + ", cargo=" + cargo + ", id=" + id + '}';
        
        return  String.format(
                """
                \t\tNome: %s
                \t\tCargo: %s
                \t\tId: %d
                """,
                nome, cargo, id);
    }

}
