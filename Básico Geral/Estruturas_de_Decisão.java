package if_statements;
import java.util.Scanner;

public class Estruturas_de_Decisão {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Calculadora simples:
		
		System.out.print("Escreva o primeiro valor : ");
		double num1 = scanner.nextDouble();
		System.out.print("Escreva o segundo valor : ");
		double num2 = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.print("Escreva qual operação deseja: ");
		String operação = scanner.nextLine();
		
		if(operação.equals("Soma") || operação.equals("Adição")) {
			System.out.printf("%.2f + %.2f = %.2f",num1 ,num2 ,num1 + num2);
		}
		else if(operação.equals("Subtração") || operação.equals("Diferença")) {
			System.out.printf("%.2f - %.2f = %.2f",num1 ,num2 , num1 - num2);
		}
		else {
			System.out.print("Você escreveu algo que ainda não foi desenvolvido!");
		}
		
	}

}
