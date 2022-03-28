<h4><b>Nome:</b> Juliana Gomes da Silva<br>
<b>RA:</b> 1460482121003</h4>

<h2>Ciclo de Vida do Desenvolvimento de Software ✨
(Plataforma de Ensino)</h2>

<h3>Atividade de Requisitos </h3>

<h4><p>:pushpin: Requisitos funcionais: são as funcionalidades de uma aplicação.<p>
  
  ![Requisitos funcionais](https://user-images.githubusercontent.com/88887821/159947119-98a62a3c-38bf-4afe-a847-6ad982b26294.png)

  
<p>:pushpin: Requisitos não-funcionais: são as qualidades que o  sistema apresenta.</h4>

![Requisitos não funcionais](https://user-images.githubusercontent.com/88887821/159947383-5fe50f68-8c72-4589-a533-74f978641c7f.png)

<h3>Atividade de Projeto </h3>

<h4><p>🪓 Diagrama de Classes:</h4><p>
  
<img width="537" alt="Pratica 1 engenharia" src="https://user-images.githubusercontent.com/88887821/160313355-a3d2d69e-0c6e-47f7-80db-942d3e0cb385.png">


<h3>Atividade de Desenvolvimento</h3>

<h4><p>Classes e JAVA </h4>

<h3>💻 Plataforma de ensino </h3>

<img width="167" alt="plataforma de ensino 1" src="https://user-images.githubusercontent.com/88887821/160312573-28a06be5-e8bc-4b76-bc33-cd03ebd6ffea.png">


```JAVA
public class Plataforma {
    import java.util.LinkedList;
    import java.util.List;

    private List <Pessoa> pessoas = new LinkedList<Pessoa>();

    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public List<Pessoa> buscarPessoaPorNome (String nome){
        for (Pessoa pessoa:pessoas) {;
            if (pessoa.getNome().equals(nome)) {;
                return pessoa;
            }
        }
        return null;
}
    public List<Email>buscarPessoaPorEmail (String email);
        for (Pessoa pessoa:pessoas){;
            if (pessoa. getEmail().equals(email)) {;
                return pessoa;
            }
        }
        return null;
}
    public void cadastrarDisciplina (Disciplina disciplinas) {
        disciplina.add(disiciplinas);
    }
    public Disciplina buscarDisciplinaPorNome(String nome){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getNomeDisciplina().equals(nome)){
                return disciplina;
            }
        }
        return null;
    }
    public Disciplina buscarDisciplinaPorDocente(String docente){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getDocente().equals(docente)){
                return disciplina;
            }
        }
        return null;
    }
    public Disciplina buscarDisciplinaPorSala(int sala){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getSala).equals(sala)){
                return disciplina;
            }
        }
        return null;
```

<h3>📄Disciplina </h3>

<img width="145" alt="Disciplina" src="https://user-images.githubusercontent.com/88887821/160313386-c12fc275-01b9-41fb-8ef7-d1e01df6376f.png">


``` JAVA

public class Disciplina {
    private String nome;
    private int sala;
    private String docente;

    public Disciplina(String nome, int sala, String docente) {
        this.nome = nome;
        this.sala = sala;
        this.docente = docente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
}
```
     
<h3>👩🏻‍🤝‍👩🏽 Pessoa</h3>

<img width="155" alt="Pessoa" src="https://user-images.githubusercontent.com/88887821/160312830-7989e73b-dcec-4479-9b92-84f08a88bb92.png">

```JAVA

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
```




