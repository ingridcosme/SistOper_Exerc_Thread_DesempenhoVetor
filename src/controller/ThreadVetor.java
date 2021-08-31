/*
 * Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um 
 * valor numérico e vetor como parâmetros. Caso o valor numérico seja par, a 
 * thread deve percorrer o vetor utilizando uma estrutura 
 * for(int i = 0 ; i < vet.length; i++) e contar o tempo para percorrer o vetor.  
 * Caso o valor numérico seja ímpar, a thread deve percorrer o vetor utilizando 
 * uma estrutura foreach e contar o tempo para percorrer o vetor. No final, ambas 
 * as possibilidades devem apresentar o tempo em segundos.
 * A operação main deve gerar um vetor de 1000 posições com valores aleatórios 
 * de 1 a 100. Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor 
 * e para a outra, passar o número 2 e o mesmo vetor.
 */

package controller;

public class ThreadVetor extends Thread {
	
	private int num;
	private int vet[];

	public ThreadVetor(int num, int vet[]) {
		this.num = num;
		this.vet = vet;
	}

	@Override
	public void run() {
		if(num % 2 == 0) {  // Caso num seja par, percorre vetor usando for
			percorrerVetorModo2();
		} else {  // Caso num seja ímpar, percorre vetor usando foreach
			percorrerVetorModo1();
		}
	}

	private void percorrerVetorModo1() {
		/* Percorre vetor usando a estrutura foreach e mede o tempo gasto para tal */
		double tempoInicial = System.nanoTime();
		
		for(@SuppressWarnings("unused") int item : vet) {  // Percorre o vetor
			
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal = tempoTotal / Math.pow(10, 9);  // Passa de ns para s
		
		System.out.println("Tempo gasto para percorrer o vetor utilizando a "
				+ "estrutura foreach: " +tempoTotal+ "s.");		
	}

	private void percorrerVetorModo2() {
		/* Percorre vetor usando a estrutura for e mede o tempo gasto para tal */
		double tempoInicial = System.nanoTime();
		
		for(int i = 0 ; i < vet.length; i++) {  // Percorre o vetor
			
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal = tempoTotal / Math.pow(10, 9);  // Passa de ns para s
		
		System.out.println("Tempo gasto para percorrer o vetor utilizando a "
				+ "estrutura for: " +tempoTotal+ "s.");
	}
}
