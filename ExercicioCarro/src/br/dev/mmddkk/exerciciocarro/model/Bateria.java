package br.dev.mmddkk.exerciciocarro.model;

public class Bateria {
    
    private String modelo;
    private String carga;
    private String fabricante;
    private int anoFabricacao;
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        //return "Bateria{" + "modelo=" + modelo + ", carga=" + carga + ", fabricante=" + fabricante + ", anoFabricacao=" + anoFabricacao + '}';
        return String.format(
                """
                Bateria:
                 \tModelo: %s 
                 \tCarga: %s 
                 \tFabricante: %s 
                 \tAno de Fabricação: %d               
                """, getModelo(), getCarga(), getFabricante(), getAnoFabricacao());
    }
    
    
    
}
