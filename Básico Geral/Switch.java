package switch_case;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Escreva o primeiro valor : ");
		double num1 = scanner.nextDouble();
		System.out.print("Escreva o segundo valor : ");
		double num2 = scanner.nextDouble();
		
		scanner.nextLine();
		System.out.print("Escreva qual operação deseja: ");
		String operação = scanner.nextLine();
		
		switch(operação) {
		case "Soma":
		case "Adição":
			System.out.printf("%.2f + %.2f = %.2f",num1 ,num2 ,num1 + num2);
			break;
		case "Subtração":
		case "Diferença":
			System.out.printf("%.2f - %.2f = %.2f",num1 ,num2 ,num1 - num2);
			break;
		default:
			System.out.println("<<< Digite uma operação satisfatória! >>>");
			break;
		}
		
		scanner.close();
	}

}
