package classeabstrata;

public class Funcionario implements Pessoa {
    
    private String nome;
    private String rg;
    private String cpf;
    
    private String cargo;
    private String id;
    private String departamento;
    
    
    @Override
    public String retornaDados() {
        
        String dados = "";
        
        dados += "Nome: " + nome + "\n";
        dados += "RG: " + rg + "\n";
        dados += "CPF: " + cpf + "\n";
        dados += "Departamento: " + departamento + "\n";
        dados += "Cargo: " + cargo + "\n";
        dados += "Crachá: " + id + "\n";
        
        return dados;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
