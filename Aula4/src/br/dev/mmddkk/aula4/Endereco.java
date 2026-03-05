package br.dev.mmddkk.aula4;

public class Endereco {
    
    private String logradouro;
    private String complemento;
    private int numero;
    private String CEP;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    @Override
    public String toString() {
        String dados = "\n";
        
        dados += logradouro + ", " + numero;
        dados += "\nComplemento:  " +  complemento + "\nCEP: " + CEP;
        return dados;
    }
    
}
