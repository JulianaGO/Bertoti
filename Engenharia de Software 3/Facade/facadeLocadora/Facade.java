public class Facade {
    private Busca catalogo;
    private Estoque estoque;
    private Locacao locacao;
    
    public Facade() {
        catalogo = new Busca();
        estoque = new Estoque();
        locacao = new Locacao();
    }
    
    public void alugarFilme(String titulo, int dias) {
        catalogo.buscarFilme(titulo);
        estoque.Disponibilidade(titulo);
        locacao.alugarFilme(titulo, dias);
    }
}




