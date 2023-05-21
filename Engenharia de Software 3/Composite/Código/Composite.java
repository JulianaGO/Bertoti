import java.util.ArrayList;
import java.util.List;

public class Composite {
    private List<Componente> children;

    public Composite() {
        this.children = new ArrayList<>();
    }

    public void addChildren(Componente c) {
        children.add(c);
    }

    public void execute() {
        children.forEach(Componente::execute);
    }
}
