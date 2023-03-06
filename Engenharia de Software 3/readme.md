<h1><b>Design Pattern</b><br>

<h2>Padrão Comportamental: Strategy </h2> 

![diagrama drawio (1)](https://user-images.githubusercontent.com/88887821/223120621-d7148945-e074-44d6-9e64-89bff011d978.png)


```JAVA
public class Fantasma{
   private ID : number;
   public cor : string;
public void movimento (Movimento x){
	movimento=movimento x;
}
public void movimento (Movimento y) {
	movimento=movimento y;
}
}

public class MovVermelho implements Movimento{
	public void mover(){
		System.out.println ("Vou perseguir você, corra");
	}
}

public class MovBranco (){
	public void mover () {
		System.out.println ("Hora de fugir, vamos");
	}
}


public interface Movimento {
	public void mover();
}
```
