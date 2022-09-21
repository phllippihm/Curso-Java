package cursoFundamentosDesafio;

public class DesafioLogicos {

	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// trabalho na quinta (V ou F)

		boolean trabalho1 = true;
		boolean trabalho2 = true;

		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;

		// operador Unário!
		boolean maisSaudavel = !comprouSorvete;

		System.out.println("Comprou tv 50\"? " + comprouTv50);
		System.out.println("Comprou tv 32\"? " + comprouTv32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);

	}

}