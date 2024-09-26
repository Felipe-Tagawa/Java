package URI;
import java.util.Scanner;

public class URI_1066 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int par = 0, impar = 0, pos = 0, neg = 0;
		
		for(int i = 0; i < 5; i++) {
			int valor = scanner.nextInt();
			if(valor % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
			if(valor > 0) {
				pos++;
			}
			else if(valor < 0) {
				neg++;
			}
		}
		
		System.out.printf("%s valor(es) par(es)%n", par);
		System.out.printf("%s valor(es) impar(es)%n", impar);
		System.out.printf("%s valor(es) positivo(s)%n", pos);
		System.out.printf("%s valor(es) negativo(s)%n", neg);
		
		scanner.close();
	}

}
