package cursoColecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila

		// Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e element -> obter o pr�ximo elementos da fila (sem remover)

		// Difen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		// Poll e Remove -> obter o pr�ximo elementos da fila e remove!
		
		// Difen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();

	}

}
