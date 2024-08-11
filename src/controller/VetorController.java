package controller;

public class VetorController {
	
	public VetorController() {
		super();
	}
	
	public double tempoPercorrer(int[] vet) {
		double tempoInicial = System.nanoTime() / Math.pow(10, 9);
		for (int elemento : vet) {
			elemento = 0;
		}
		double tempoFinal = System.nanoTime() / Math.pow(10, 9);
		
		return tempoFinal - tempoInicial;
	}

}
