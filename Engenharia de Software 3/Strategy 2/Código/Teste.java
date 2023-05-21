public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filme filme = new Filme();
		filme.setGenero(new Documentario());
		filme.exibirLista();
		filme.setGenero(new Curta());
		filme.exibirLista();
	}

}