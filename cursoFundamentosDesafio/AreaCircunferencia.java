package cursoFundamentosDesafio;

public class AreaCircunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raio = 3.4;
		
		// "Final" serve para definir o valor final na variável!!
		
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		// Alterando o valor do raio
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2.");
	}

}
