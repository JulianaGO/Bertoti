public class Pacman {
    private Movimento realizaMovimento;
        
    public void PacMan() {
            // Definir o comportamento padrão como perseguição
            realizaMovimento = new MovBranco();
    }
        
    public void setMovimento(Movimento movimento) {
            this.realizaMovimento = movimento;
    }
        
    public void move() {
            realizaMovimento.move();
     }
}
    

