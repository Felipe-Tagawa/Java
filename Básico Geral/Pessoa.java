package Olha;

public class Pessoa {

	public static void main(String[] args) {
		int idade = 19; // %s
		String nome = "Felipe"; // %s
		boolean maior_de_idade = true; // %b
		double media_final = 90.16F; // %f
		char caracter = '%'; // %c
		System.out.println("Meu nome é " + nome + " , e eu tenho " + idade + " anos!");
		if(maior_de_idade) {
			System.out.println("Sou maior de idade!");
		}
		
		String formatted_string = String.format("Minha idade é %s. Meu nome é %s. Eu gosto da palavra %b, minha nota final foi %f, e gosto deste caracter: %c", idade, nome, maior_de_idade, media_final, caracter);
		System.out.println(formatted_string);
		Datatypes.main(args);
	}
}

// Quando criamos uma classe fora da principal, precisamos chamar ela na principal para mostrar.
class Datatypes {
	public static void main(String[] args) {
		// Valores inteiros.
		byte valor1 = 100; // Byte vai de -128 a 127.
		short valor_pequeno = 20000; // short vai de -32.768 a 32.767.
		int valor_medio = 1000000000; // int vai de -2147483648 a 2147483647.
		long valor_alto = 10000000000000000L; // Muitos valores.
		
		// Valores flutuantes.
		float decimal_menor = 1.758935F;
		double decimal_maior = 74.548527394558475;
		
		// Valores booleanos.
		boolean verdade = true;
		boolean falso = false;
		
		// Caracteres.
		
		char endereço = '\u00A9';
		String nome = "Felipe";
		
		System.out.println("endereço = " + endereço);
	}
}
