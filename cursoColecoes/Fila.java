package cursoColecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila

		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e element -> obter o próximo elementos da fila (sem remover)

		// Difença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		// Poll e Remove -> obter o próximo elementos da fila e remove!
		
		// Difença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma exceção
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
