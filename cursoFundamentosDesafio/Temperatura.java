package cursoFundamentosDesafio;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		// (°F - 32) * 5/9 = °C
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a quantidade de graus °F: ");
		double fahrenheit = teclado.nextDouble();
		
		final double fator = 5.0 / 9.0;
		final double ajuste = 32;
		
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println("O resultado é: " + celsius + "°C.");
		
		teclado.close();
	}
	

}
