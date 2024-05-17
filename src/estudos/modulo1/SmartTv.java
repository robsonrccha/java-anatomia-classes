package estudos.modulo1;

public class SmartTv {
	
	Boolean ligada = false;
	Boolean desligada = true;
	Integer canal = 5;
	Integer volume = 20;
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		desligada = false;	
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}

}
