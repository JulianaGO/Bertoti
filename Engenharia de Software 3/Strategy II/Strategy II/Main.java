public class Main{

    public static void main (String[] args){
        Pacman pacman = new Pacman (new Perseguir());

        pacman.executeStrategy();

        pacman.setStrategy(new Fugir());

        pacman.executeStrategy();
    }
}