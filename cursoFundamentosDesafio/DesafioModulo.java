package cursoFundamentosDesafio;

import java.util.Scanner;

public class DesafioModulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o n�mero: ");
		double num1 = teclado.nextDouble();

		System.out.print("Informe o n�mero: ");
		double num2 = teclado.nextDouble();

		System.out.print("Informe a opera��o: ");
		String op = teclado.next();

		// L�gica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		

		teclado.close();

	}

}
