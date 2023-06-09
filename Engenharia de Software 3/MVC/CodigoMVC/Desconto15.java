public class Desconto15 implements Desconto{
    private View view;
    private Mercado mercado;
    
    public void receberDesconto(){
      System.out.println("Você ganhou um desconto de 15% no valor da compra!");
    }
    
    public void setView(View v){
      this.view = v;
    }
    
  }