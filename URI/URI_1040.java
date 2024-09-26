package URI;
import java.util.Scanner;

public class URI_1040 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		double n4 = scanner.nextDouble();
		
		double media = (n1*2 + n2*3 + n3*4 + n4)/ 10.0;
		
		media = Math.floor(media *10) / 10.0;
		
		if(media >= 7.0) {
		    System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		}
		else if(media < 5.0) {
		    System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		}
		else {
		    System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			double n_exame = scanner.nextDouble();
			System.out.printf("Nota do exame: %.1f%n",n_exame);
			double new_media = (n_exame + media) / 2.0;
			if(new_media >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", new_media);
			}
			else {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", new_media);
			}
		}
		
		scanner.close();

	}

}
