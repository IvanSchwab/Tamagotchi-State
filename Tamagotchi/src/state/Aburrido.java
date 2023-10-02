package state;

public class Aburrido implements State {

	private Tamagotchi tamagotchi;

	@Override
	public void jugar() {
		tamagotchi.tamagotchiFeliz();
		System.out.println("¡Sii juguemos!\n");
		tamagotchi.setState(new Cansado());
	}

	@Override
	public void alimentar() {
		tamagotchi.tamagotchiAburrido();
		System.out.println("¡No quiero comer!\n");
	}

	@Override
	public void dormir() {
		tamagotchi.tamagotchiAburrido();
		System.out.println("¡No quiero dormir!\n");
	}

	@Override
	public void comoEstas() {
		tamagotchi.tamagotchiAburrido();
		System.out.println("Estoy aburrido...\n");
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}

}
