import java.util.ArrayList;
import java.util.List;

public class Mercado implements Subject {
    private List<Produto> produtos;
    private List<Observer> observers;
    
    public Mercado() {
        produtos = new ArrayList<>();
        observers = new ArrayList<>();
    }
    
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }
    
    public void notifyObservers(List<Produto> l) {
        this.observers.forEach(ob -> {
            System.out.println("Novos produtos adicionados:");
            l.forEach(p -> {
                System.out.println(". " + p.getNome());
            });
        });
    }
    
    public void addProduto(Produto p) {
        this.produtos.add(p);
        notifyObservers(produtos);
    }
   
    public Produto buscarProduto(String nome) {
        return this.produtos.stream().filter(r -> r.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
    }
}

    