package URI;
import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    String nome = scanner.nextLine();
	    double salario = scanner.nextDouble();
	    double montante = scanner.nextDouble();
	    
	    System.out.printf("TOTAL = R$ %.2f%n", salario + 0.15 * montante);
	    scanner.close();

	}

}
