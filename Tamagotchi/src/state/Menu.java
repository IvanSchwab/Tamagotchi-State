package state;

import java.util.Scanner;

public class Menu {

	private Tamagotchi tamagotchi;

	public Menu(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}

	public void display() {
		Scanner scanner = new Scanner(System.in);
		char opcion;

		String mensajeOpciones = "Realizar acción:\n "
				+ "A) Alimentar, D) Dormir, J) Jugar, P) Preguntar estado, S) Salir";

		boolean loop = true;

		while (loop) {
			System.out.println(mensajeOpciones);
			opcion = scanner.next().toUpperCase().charAt(0);

			switch (opcion) {
			case 'A':
				tamagotchi.alimentar();
				break;
			case 'D':
				tamagotchi.dormir();
				break;
			case 'J':
				tamagotchi.jugar();
				break;
			case 'P':
				tamagotchi.comoEstas();
				break;
			case 'S':
				System.out.println("Nos vemos!!");
				loop = false;
				break;
			default:
				System.out.println("Opción no valida");
			}

		}

	}
}
