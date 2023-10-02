package state;

import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {

	private Tamagotchi tamagotchi;

	@Override
	public void jugar() {
		tamagotchi.tamagotchiDormido();
	}

	@Override
	public void alimentar() {
		tamagotchi.tamagotchiDormido();
	}

	@Override
	public void dormir() {
		tamagotchi.tamagotchiDormido();
	}

	@Override
	public void comoEstas() {
		tamagotchi.tamagotchiDormido();
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				Durmiendo.this.tamagotchi.setState(new Hambriento());
			}
		}, 30000);
	}

}
