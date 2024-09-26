package URI;

import java.util.Scanner;

public class URI_1008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    int cod = scanner.nextInt();
	    int quant = scanner.nextInt();
	    double valor_por_hora = scanner.nextDouble();
	    
	    System.out.printf("NUMBER = %s%n", cod);
	    System.out.printf("SALARY = U$ %.2f%n", quant*valor_por_hora);
	    
	    scanner.close();

	}

}
