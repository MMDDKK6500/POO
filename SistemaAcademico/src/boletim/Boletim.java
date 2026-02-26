package boletim;

public class Boletim {
    private float nota;
    private int frequencia;
    private String status;

    public Boletim(float n, int f, String s) {
        this.nota = n;
        this.frequencia = f;
        this.status = s;
    }
    
    public Boletim(String st) {
       this.nota = 10;
       this.frequencia = 100;
       this.status = st;
    }
    
    @Override
    public String toString() {
        return "Boletim{" + "nota=" + nota + ", frequencia=" + frequencia + ", status=" + status + '}';
    }
    
    public void imprimir() {
        System.out.printf("Nota: %f \n Frequencia: %d \n Status: %s \n", this.nota, this.frequencia, this.status);
    }
    
}


