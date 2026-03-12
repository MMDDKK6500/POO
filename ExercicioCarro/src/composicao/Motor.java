package composicao;

public class Motor {
    
    private String modelo;
    private String potencia;
    private String fabricante;
    private int qtdeCilindros;
    private float volume;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQtdeCilindros() {
        return qtdeCilindros;
    }

    public void setQtdeCilindros(int qtdeCilindros) {
        this.qtdeCilindros = qtdeCilindros;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Motor{" + "modelo=" + modelo + ", potencia=" + potencia + ", fabricante=" + fabricante + ", qtde_cilindros=" + qtdeCilindros + ", volume=" + volume + '}';
    }
    
    
    
}
