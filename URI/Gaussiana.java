package URI;
import java.util.Scanner;

public class Gaussiana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x = scanner.nextDouble(), m = scanner.nextDouble(), s = scanner.nextDouble();
		
		double gaussiana = (1/(Math.sqrt(2*Math.PI*s*s)))*Math.exp(-((x-m)*(x-m)/(2*s*s)));
		
		System.out.printf("%.4f%n",gaussiana);
		
		scanner.close();

	}

}
