package curso.Oo.Heranca.Desafio;

public interface Luxo {

	public void ligarAr();
	abstract void desligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	}
	
}
