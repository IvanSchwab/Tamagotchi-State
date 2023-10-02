package state;

public class Cansado implements State {

	private Tamagotchi tamagotchi;

	@Override
	public void jugar() {
		tamagotchi.tamagotchiCansado();
		System.out.println("Estoy muy cansado para jugar...\n");
	}

	@Override
	public void alimentar() {
		tamagotchi.tamagotchiCansado();
		System.out.println("Quiero irme a dormir...\n");
	}

	@Override
	public void dormir() {
		tamagotchi.tamagotchiDormido();
		tamagotchi.setState(new Durmiendo());
	}

	@Override
	public void comoEstas() {
		tamagotchi.tamagotchiCansado();
		System.out.println("Estoy cansado, quiero ir a dormir...\n");
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}

}
