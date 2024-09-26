package Olha;
import java.util.Scanner;

public class Entrada_de_dados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual seu nome? \n");
		String nome = scanner.nextLine();
		System.out.printf("Como o %s está? Quantos anos ele tem? \n", nome); // Format.
		int idade = scanner.nextInt();
		// double valor2 = scanner.nextDouble();
		
		System.out.printf("Ele tem %d anos! \n", idade);
		
		// Mesmo problema do cin com char em c++, erro de enter.
		// Resolução : scanner.nextLine(); // Similar ao cin.ignore();
		
		scanner.nextLine();
		
		// Para não ter que usar o nextLine(); :
		// int idade = Integer.ParseInt(scanner.nextLine());
		// double valor = Double.ParseDouble(scanner.nextLine());
		
		System.out.print("Qual sua linguagem de programação que mais praticou? \n");
		
		String linguagem = scanner.nextLine();
		System.out.printf("%s é a linguagem que mais pratiquei!",linguagem);
		
		scanner.close();
	}

}
