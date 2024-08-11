package controller;

public class Main {
	
	public static void main(String[] args) {
		
		VetorController vetorController = new VetorController();
		int tamanho = 1000;
		
		for (int i = 0; i < 3; i++) {
			int[] vetor = new int[tamanho];
			double tempo = vetorController.tempoPercorrer(vetor);
			System.out.println("Tempo de percorrer um vetor de " + tamanho + " posições:");
			System.out.println(tempo + " segundos\n");
			tamanho *= 10;
		}
	}

}
