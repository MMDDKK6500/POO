package campeonato;

public class PrincipalCampeonato {

    public static void main(String[] args) {
        
        Time t[] = new Time[4];
        
        t[0] = new Time("Santa Peba", "Sao Paulo", "SP", 1998, 0, 0, 0, 11);
        t[1] = new Time("Cambitas", "Osasco", "SP", 2001, 0, 0, 0, 12);
        t[2] = new Time("Belisco", "Itú", "SP", 2003, 0, 0, 0, 8);
        t[3] = new Time("Bazucas", "Cunha", "SP", 2010, 0, 0, 0, 10);
        
        Jogo jg = new Jogo();
        
        jg.marcarJogo(t[0], t[3]);
        
        jg.jogar();
        
        for (Time time: t) {
            System.out.println(time.status());
        }
        
    }
    
}
