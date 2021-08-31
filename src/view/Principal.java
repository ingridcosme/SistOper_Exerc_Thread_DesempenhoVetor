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

package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int vet[] = new int[1000];
		
		/*Gerar números aleatórios de 1 a 100*/
		for(int item: vet) {
			vet[item] = (int)((Math.random() * 100) + 1);
		}
		
		for(int num = 1 ; num <= 2 ; num++) {  // Inicia as Threads
			Thread percorreVetor = new ThreadVetor(num, vet);
			percorreVetor.start();
		}
	}

}
