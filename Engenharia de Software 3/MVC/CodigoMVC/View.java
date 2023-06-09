import java.util.List;

public class View implements Observer{
    private Desconto desconto;
    private List<Produto> produtos;
    
    public void setDesconto(Desconto b){
      this.desconto = b;
    }
    
    public void update(List<Produto> p){
      this.produtos = p;
    }
    
  }