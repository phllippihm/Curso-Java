package cursoFundamentos;

public class Interferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 4.5; // declara��o e inicializa��o
		System.out.println(a);

		a = 12;
		System.out.println(a);

		// a = "..."; n�o � permitido!

		var b = 4.5;
		System.out.println(b);

		var c = "Texto";
		System.out.println(c);

		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5; n�o � permitido!
		
		double d; // variavel foi declarada
		d = 123.65; // variavel foi inicializada 
		System.out.println(d); // usada!
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; // inteiro
		// f = 12.01; n�o � permitido!
		System.out.println(f);

	}

}
