package URI;
import java.util.Scanner;

public class URI_1001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.printf("X = %s%n", num1 + num2);
        
        scanner.close();

	}

}
