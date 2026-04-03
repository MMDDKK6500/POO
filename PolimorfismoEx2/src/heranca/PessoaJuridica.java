package heranca;

public class PessoaJuridica extends Pessoa {
    
    String cnpj;
    double salarioMensal;
    
    public PessoaJuridica() {
        super();
    }
    
    public PessoaJuridica(String nome, int idade, String endereco, String cnpj, double salarioMensal) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public String retornaDados(){
        String dados = "";
        
        dados = super.retornaDados();
        
        dados += "CNPJ: " + cnpj + "\n";
        
        return dados;
    }
    
}
