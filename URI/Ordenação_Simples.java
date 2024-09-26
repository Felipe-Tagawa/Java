package URI;
import java.util.Scanner;

public class Ordenação_Simples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		int a_ = a, b_ = b, c_ = c, temp;
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if(a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println(a_);
		System.out.println(b_);
		System.out.println(c_);
		
		scanner.close();
	}

}
