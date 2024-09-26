package Olha;
import java.util.ArrayList;
import java.util.Comparator;

public class Array_Lists {

	public static void main(String[] args) {
		ArrayList<Integer> valor = new ArrayList<Integer>();
		
		valor.add(5);valor.add(2);valor.add(9);valor.add(4);
		System.out.println(valor.toString());
		System.out.println(valor.get(1)); // Índice.
		
		valor.sort(Comparator.naturalOrder());
		System.out.println(valor.toString());
		valor.sort(Comparator.reverseOrder());
		System.out.println(valor.toString());
		
		valor.remove(2); // Remover da posição 2:
		valor.remove(Integer.valueOf(2)); // Remove o 2.
		System.out.println(valor.toString());
		valor.forEach(valores -> {
			System.out.println(valores*2);
		});
		
		valor.set(1, 7);
		System.out.println(valor.toString());
		System.out.println(valor.size());
		System.out.println(valor.contains(9)); // Se contém o 9 :: true.
		System.out.println(valor.contains(-1)); // Se contém o -1 :: false.
		System.out.println(valor.isEmpty()); // Falso.
		valor.clear();
		System.out.println(valor.isEmpty()); // True.
		
		
	}

}
