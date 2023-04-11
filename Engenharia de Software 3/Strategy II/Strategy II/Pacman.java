public class Pacman{
    private Strategy strategy;

    public Pacman (Strategy strategy){
        this.strategy=strategy;
    }

    public void setStrategy (Strategy strategy){
        this.strategy=strategy;
    }

    public void executeStrategy(){
        strategy.executeStrategy();
    }
}