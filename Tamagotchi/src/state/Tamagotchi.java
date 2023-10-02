package state;

public class Tamagotchi {

	private State state;

	public Tamagotchi() {
		setState(new Aburrido());
	}

	public void setState(State state) {
		this.state = state;
		this.state.setTamagotchi(this);
	}

	void jugar() {
		this.state.jugar();
	}

	void alimentar() {
		this.state.alimentar();
	}

	void dormir() {
		this.state.dormir();
	}

	void comoEstas() {
		this.state.comoEstas();
	}

	void tamagotchiFeliz() {
		System.out.println("  _____");
		System.out.println(" /     \\");
		System.out.println("|  ^_^  |");
		System.out.println("|  \\_/  |");
		System.out.println(" \\_____/ ");
	}

	void tamagotchiAburrido() {
		System.out.println("  _____");
		System.out.println(" /     \\");
		System.out.println("|  - -  |");
		System.out.println("|   -   |");
		System.out.println("|  \\_/  |");
		System.out.println(" \\_____/ ");
	}

	void tamagotchiCansado() {
		System.out.println("  _____");
		System.out.println(" /     \\");
		System.out.println("|  x x  |");
		System.out.println("|   -   |");
		System.out.println("|  \\_/  |");
		System.out.println(" \\_____/ ");
	}

	void tamagotchiHambriento() {
		System.out.println("  _____");
		System.out.println(" /     \\");
		System.out.println("|  o o  |");
		System.out.println("|   ^   |");
		System.out.println("|  \\_/  |");
		System.out.println(" \\_____/ ");

	}

	void tamagotchiDormido() {
		System.out.println("  _____");
		System.out.println(" /     \\");
		System.out.println("|  - -  |");
		System.out.println("|  ~ ~  |");
		System.out.println("|  \\_/  |");
		System.out.println(" \\_____/ ");
		System.out.println("Zzzzz...\n");
	}
}
