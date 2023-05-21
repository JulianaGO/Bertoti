
public class Curta extends Thread implements GeneroFilme {
	
	String list[] = { "Bao", "Float", "Purl"};

	@Override
	public void assistirFilme() {
		// TODO Auto-generated method stub
		Thread threadCurta = new Thread(this);
		threadCurta.start();
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