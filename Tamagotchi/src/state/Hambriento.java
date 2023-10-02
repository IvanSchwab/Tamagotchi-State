package state;

public class Hambriento implements State {

	private Tamagotchi tamagotchi;

	@Override
	public void jugar() {
		tamagotchi.tamagotchiHambriento();
		System.out.println("¡No quiero jugar, tengo hambre!\n");
	}

	@Override
	public void alimentar() {
		tamagotchi.tamagotchiFeliz();
		System.out.println("¡Sii, comamos!\n");
		tamagotchi.setState(new Aburrido());
	}

	@Override
	public void dormir() {
		tamagotchi.tamagotchiHambriento();
		System.out.println("¡No quiero dormir, tengo hambre!\n");
	}

	@Override
	public void comoEstas() {
		tamagotchi.tamagotchiHambriento();
		System.out.println("¡Estoy hambriento!\n");
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}

}
