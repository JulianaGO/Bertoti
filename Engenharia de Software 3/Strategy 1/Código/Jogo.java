public class Jogo {
        public static void main(String[] args) {
            Fantasma pacMan = new Fantasma();
            
            pacMan.move(); 
            
            pacMan.setMovimento(new MovVermelho());
            pacMan.move(); 
        }
    }

