package estudos.modulo1;

public class UsuarioSmarTv {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		

		System.out.println("TV ligada? " + smartTv.ligada);
		System.out.println("TV desligada? " + smartTv.desligada);
		System.out.println("Canal default da TV: " + smartTv.canal);
		System.out.println("Volume default da TV: " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo Status -> TV ligada: " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status -> TV ligada: " + smartTv.desligada);
		
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.aumentarVolume();
		System.out.println("volume aumentado para: " + smartTv.volume);
		
		System.out.println("Canal atual: " + smartTv.canal);
		smartTv.mudarCanal(13);
		System.out.println("Canal escolhido: " + smartTv.canal);
		
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		System.out.println("Canal aumentou para: " + smartTv.canal);
		
		smartTv.diminuirCanal();
		System.out.println("Canal diminuiu para: " + smartTv.canal);
	}

}
