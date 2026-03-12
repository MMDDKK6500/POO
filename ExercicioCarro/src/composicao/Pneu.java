package composicao;

public class Pneu {
    
    private String fabricante;
    private String modelo;
    private float tamanho;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Pneu{" + "fabricante=" + fabricante + ", modelo=" + modelo + ", tamanho=" + tamanho + '}';
    }
    
}
