public class Fantasma {
    private Movimento realizaMovimento;
        
    public void PacMan() {
     
            realizaMovimento = new MovBranco();
    }
        
    public void setMovimento(Movimento movimento) {
            this.realizaMovimento = movimento;
    }
        
    public void move() {
            realizaMovimento.move();
     }
}
    

