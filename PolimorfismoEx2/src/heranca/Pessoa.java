package heranca;

public class Pessoa {
    
    String nome, endereco;
    int idade;
    
    public String retornaDados(){
        String dados = "";
        
        dados += "Nome: " + nome + "\n";
        dados += "Idade: " + idade + "\n";
        dados += "Endereço: " + endereco + "\n";
        
        return dados;
    }
}
