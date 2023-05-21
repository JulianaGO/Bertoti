public class Filial {
    private Cliente cliente;
    private Locacao locadora;
    public void alugarFilme() {
       cliente.alugarFilme();
       locadora.alugarFilme();
    }
}
