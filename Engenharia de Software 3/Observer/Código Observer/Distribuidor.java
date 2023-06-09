public class Distribuidor implements Observer {
    private String nome;

    public Distribuidor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + ", mensagem recebida: " + mensagem);
    }
}
