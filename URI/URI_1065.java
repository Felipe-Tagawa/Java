package URI;
import java.util.Scanner;

public class URI_1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    int contador = 0;
	    
	    for(int i = 0; i < 5; i++){
	        int valor = scanner.nextInt();
	        if(valor % 2 == 0){
	            contador++;
	        }
	    }
	    
	    System.out.printf("%s valores pares%n", contador);
	    
	    scanner.close();

	}

}
