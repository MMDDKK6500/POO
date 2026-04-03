package heranca;

public class PessoaFisica extends Pessoa {
    
    String cpf, rg;
    
    public PessoaFisica() {
        super();
    }
    
    public PessoaFisica(String nome, int idade, String endereco, String cpf, String rg) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
    }
    
    @Override
    public String retornaDados(){
        String dados = "";
        
        dados = super.retornaDados();
        
        dados += "CPF: " + cpf + "\n";
        dados += "RG: " + rg + "\n";
        
        return dados;
    }
}
