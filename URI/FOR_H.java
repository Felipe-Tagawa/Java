package URI;
import java.util.Scanner;

public class FOR_H {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		double soma = 0;
		
		for(int i = 1; i <= n; i++) {
			soma += (1.0/i);
		}
		
		System.out.printf("%.4f",soma);
		
		scanner.close();

	}

}
