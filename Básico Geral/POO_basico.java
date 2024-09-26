package Olha;
import java.time.LocalDate;
import java.time.Period;

public class POO_basico {

	public static void main(String[] args) {
		User novo_usuario = new User();
		
		novo_usuario.nome = "Felipe Tagawa";
		novo_usuario.aniversario = LocalDate.parse("2005-02-11");
		System.out.printf("%s nasceu em %s e tem, hoje, %s anos.%n", novo_usuario.nome, novo_usuario.aniversario.toString(), novo_usuario.idade());

	}

}

class User{
	String nome;
	LocalDate aniversario;
	
	int idade() {
		int idade = Period.between(this.aniversario, LocalDate.now()).getYears();
		
		return idade;
	}
}
