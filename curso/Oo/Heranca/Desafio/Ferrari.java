package curso.Oo.Heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);

	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		setDelta(35);

	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		setDelta(15);

	}

	@Override
	public void ligarAr() {
		ligarAr = true;

	}

	@Override
	public void desligarAr() {
		ligarAr = false;

	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}

//	@Override
//	public void acelerar() {
//		super.acelerar();
//		
//	}

}
