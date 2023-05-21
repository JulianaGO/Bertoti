
public class Filme {
	private GeneroFilme generoFilme;
	public void setGenero (GeneroFilme filme) {
		generoFilme = filme;
	}
	
	public void exibirLista() {
		generoFilme.assistirFilme();
	}
}