import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Observer> observers = new ArrayList<>();
    private String mensagem;

    public void adicionarObservador(Observer observador) {
        observers.add(observador);
    }

    public void removerObservador(Observer observador) {
        observers.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observers : observers) {
            observers.atualizar(mensagem);
        }
    }

    public void definirMensagem(String mensagem) {
        this.mensagem = mensagem;
        notificarObservadores();
    }
}

