package Olha;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		int vetor[] = {2,1,5,4,4}; // Não se coloca o número de posições.
		System.out.println(Arrays.toString(vetor));
		System.out.println(vetor.length);
		Arrays.sort(vetor);
		
		int buscado = 5;
		int inicial = 0;
		int final_ = 2;
		
		int indice = Arrays.binarySearch(vetor,inicial, final_,  buscado); // Não consegue buscar, pois foi colocado um limite de 0 a 2.
		System.out.println(Arrays.toString(vetor));
		System.out.println("A posição é: " + indice);
		System.out.println("A buscado é: " + vetor[indice]);
		
	}

}
