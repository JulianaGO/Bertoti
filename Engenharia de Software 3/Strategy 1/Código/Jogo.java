public class Jogo {
        public static void main(String[] args) {
            Pacman pacMan = new Pacman();
            
            pacMan.move(); 
            
            pacMan.setMovimento(new MovVermelho());
            pacMan.move(); 
        }
    }

