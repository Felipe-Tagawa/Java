package URI;

import java.util.Scanner;

public class URI_1005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    double num1 = scanner.nextDouble();
	    double num2 = scanner.nextDouble();
	    double media = (num1*3.5 + num2*7.5) / 11.0;
	    
	    System.out.printf("MEDIA = %.5f%n", media);
	    
	    scanner.close();

	}

}
