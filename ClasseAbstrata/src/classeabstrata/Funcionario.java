package classeabstrata;

public class Funcionario extends Pessoa {
    
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
    
    
}
