package cursoFundamentosDesafio;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		// calcular media de 3 salarios convertendo string para double
		Scanner teclado = new Scanner(System.in);

		System.out.println("informe o primeiro sal�rio: ");
		String valor1 = teclado.next().replace(",", ".");

		System.out.println("informe o segundo sal�rio: ");
		String valor2 = teclado.next().replace(",", ".");

		System.out.println("informe o terceiro sal�rio: ");
		String valor3 = teclado.next().replace(",", ".");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = (salario1 + salario2 + salario3) / 3;

		System.out.println("A media dos sal�rios � " + media);

		teclado.close();
	}

}
