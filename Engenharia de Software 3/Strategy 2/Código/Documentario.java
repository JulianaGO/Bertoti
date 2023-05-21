

public class Documentario extends Thread implements GeneroFilme{
	
	String list[] = { "For Sama", "SOS Saude", "Winter"};

	@Override
	public void assistirFilme() {
		// TODO Auto-generated method stub
		Thread threadDocumentario = new Thread(this);
		threadDocumentario.start();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " esta sendo exibido!");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A lista acabou!");
	}

}