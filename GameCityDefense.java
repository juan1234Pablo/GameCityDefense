import java.util.Scanner;

class ER {
	int monedas;
}

public class SupervivenceDay { 
	public static void main (String[] arg) {
		ER er = new ER();
		boolean pR = false;
		boolean sR = false;
		boolean tR = false;
		boolean cR = false;
		boolean qR = false;
		boolean seR = false;
		boolean sepR = false;
		boolean ocR = false;
		boolean noR = false;
		boolean deR = false;
		boolean fG = false;
		int clr = 1;
		Scanner scanner = new Scanner(System.in);
	System.out.println("Eres el unico general de la ciudad y debes defenderla.");
	System.out.println("Lógica del juego: Arquero > Guerrero, Duende > Arquero, Guerrero > Duende");
	System.out.println("Mira, debes adivinar una adivinanza y contar las letras de la respuesta:");
	System.out.println("Si tiene menos de 5 letras saldrán duendes enemigos, si el numero es impar saldrán arqueros y si es par saldrán guerreros.");
	System.out.println("El juego acaba cuando pierdes todas tus monedas o ganas las 10 rondas.");
	System.out.println("Toma 10 monedas para comprar unidades, más tarde te daré más.");
	er.monedas += 10;
	System.out.println(" [!]Has recibido 10 monedas[!] ");
	System.out.println("Inserta OK para empezar");
	String empezar = scanner.nextLine().toUpperCase();
	if (empezar.equals("OK")) {
		pR = true;
	}
	if (pR) {
		fG = false;
		System.out.println("");
		System.out.println("Monedas:" + er.monedas);
		System.out.println("Adivinanza: Blanca por dentro, verde por fuera. Si quieres que te lo diga, espera");
		System.out.println("Manzana");
		System.out.println("Pera");
		System.out.println("Sandía");
		System.out.println("Inserta A para desplegar guerreros+");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("A")) {
			System.out.println("Ganaste!");
			er.monedas -= 2;
			System.out.println(" [!]Has gastado 2 mmonedas[!] ");
			sR = true;
		}
		else {
			er.monedas -= 8;
			if (clr > er.monedas) {
				System.out.println("Perdiste");
			} else {
				System.out.println("Incorrecto!");
			}
		} 
	}
	if (sR) {
		pR = false;
		System.out.println("Muy bien, parece que pasaste la primera ronda.");
		System.out.println("Mira, toma algunas monedas.");
		System.out.println(" [!]Has recibido +2 monedas[!] ");
		er.monedas += 2;
		System.out.println("");
		System.out.println("monedas:" + er.monedas);
		System.out.println("Adivinanza: Oro parece, plata no es. ");
		System.out.println("Platino");
		System.out.println("Banana");
		System.out.println("anillo");
		System.out.println("Inserta A para desplegar guerreros");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("B")) {
			er.monedas -= 2;
			tR = true;
		} else {
			er.monedas -= 8;
			if (clr > er.monedas) {
				System.out.println("Perdiste");
			} else {
				System.out.println("Incorrecto!");
				tR = true;
			}
		}
	}
	if (tR) {
		sR = false;
		System.out.println("Muy bien, parece que pasaste la ronda.");
		System.out.println("Mira, toma algunas monedas.");
		System.out.println(" [!]Has recibido +2 monedas[!] ");
		er.monedas += 2;
		System.out.println("");
		System.out.println("monedas:" + er.monedas);
		System.out.println("Soy redondo y amarillo, mi piel es gruesa y áspera, ¿qué soy?");
		System.out.println("Limón");
		System.out.println("Banana");
		System.out.println("Naranja");
		System.out.println("Inserta A para desplegar guerreros+");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("C")) {
		cR = true;
		er.monedas -= 2;
		} else {
			er.monedas -= 8;
			if (clr > er.monedas) {
				System.out.println("Perdiste");
			} else {
				System.out.println("Incorrecto!");
				cR = true;
			}
		}
	}
	if (cR) {
		tR = false;
		System.out.println("Muy bien, parece que pasaste la ronda.");
		System.out.println("Mira, toma algunas monedas.");
		System.out.println(" [!]Has recibido +2 monedas[!] ");
		er.monedas += 2;
		System.out.println("");
		System.out.println("monedas:" + er.monedas);
		System.out.println("Parece una pluma y se mueve con viento, ¿qué es?");
		System.out.println("Cometa");
		System.out.println("Globo");
		System.out.println("Hoja");
		System.out.println("Inserta A para desplegar guerreros+");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("B")) {
		er.monedas -= 2;
		qR = true;
		} 			if (clr > er.monedas) {
			System.out.println("Perdiste");
		} else {
			System.out.println("Incorrecto!");
			qR = true;
		}
	}
	if (qR) {
		cR = false;
		System.out.println("Muy bien, parece que pasaste la ronda.");
		System.out.println("Mira, toma algunas monedas.");
		System.out.println(" [!]Has recibido +2 monedas[!] ");
		er.monedas += 2;
		System.out.println("");
		System.out.println("monedas:" + er.monedas);
		System.out.println("Corre sin patas, habla sin voz, tiene lugares donde nadie va, ¿qué es?");
		System.out.println("Reloj");
		System.out.println("Mar");
		System.out.println("Televisión");
		System.out.println("Inserta A para desplegar guerreros+");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("C")) {
			er.monedas -= 2;
		seR = true;
		} 			if (clr > er.monedas) {
			System.out.println("Perdiste");
		} else {
			System.out.println("Incorrecto!");
			seR = true;
		}
	}
	if (seR) {
		qR = false;
		System.out.println("Muy bien, parece que pasaste la ronda.");
		System.out.println("Mira, toma algunas monedas.");
		System.out.println(" [!]Has recibido +2 monedas[!] ");
		er.monedas += 2;
		System.out.println("");
		System.out.println("monedas:" + er.monedas);
		System.out.println("Tengo hojas pero no soy un árbol, tengo raíces pero no soy planta, ¿qué soy?");
		System.out.println("Libro");
		System.out.println("Flor");
		System.out.println("Papel");
		System.out.println("Inserta A para desplegar guerreros+");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("C")) {
			er.monedas -= 2;
		sepR = true;
		} 			if (clr > er.monedas) {
			System.out.println("Perdiste");
		} else {
			System.out.println("Incorrecto!");
			sepR = true;
		}
	}
	if (sepR) {
		seR = false;
		System.out.println("Muy bien, parece que pasaste la ronda.");
		System.out.println("Mira, toma algunas monedas.");
		System.out.println(" [!]Has recibido +2 monedas[!] ");
		er.monedas += 2;
		System.out.println("");
		System.out.println("monedas:" + er.monedas);
		System.out.println("Soy un cuadrado mágico lleno de números, ¿qué soy?");
		System.out.println("Sudoku");
		System.out.println("Rompecabezas");
		System.out.println("Rompecabezas");
		System.out.println("Inserta A para desplegar guerreros+");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("B")) {
			er.monedas -= 2;
		ocR = true;
		} 			if (clr > er.monedas) {
			System.out.println("Perdiste");
		} else {
			System.out.println("Incorrecto!");
			ocR = true;
		}
	}
	if (ocR) {
		sepR = false;
		System.out.println("Muy bien, parece que pasaste la ronda.");
		System.out.println("Mira, toma algunas monedas.");
		System.out.println(" [!]Has recibido +2 monedas[!] ");
		er.monedas += 2;
		System.out.println("");
		System.out.println("monedas:" + er.monedas);
		System.out.println("Soy un medio de transporte, tengo dos ruedas y me mantengo de pie, ¿qué soy?");
		System.out.println("Bicicleta");
		System.out.println("Scooter");
		System.out.println("Patineta");
		System.out.println("Inserta A para desplegar guerreros+");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("C")) {
			er.monedas -= 2;
		noR = true;
		} 			if (clr > er.monedas) {
			System.out.println("Perdiste");
		} else {
			System.out.println("Incorrecto!");
			noR = true;
		}
	}
	if (noR) {
		ocR = false;
		System.out.println("Muy bien, parece que pasaste la ronda.");
		System.out.println("Mira, toma algunas monedas.");
		System.out.println(" [!]Has recibido +2 monedas[!] ");
		er.monedas += 2;
		System.out.println("");
		System.out.println("monedas:" + er.monedas);
		System.out.println("Soy un lugar donde los perros ladran y los gatos maúllan, ¿qué soy?");
		System.out.println("Casa");
		System.out.println("Granero");
		System.out.println("Callejón");
		System.out.println("Inserta A para desplegar guerreros+");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("A")) {
			er.monedas -= 2;
		deR = true;
		} 			if (clr > er.monedas) {
			System.out.println("Perdiste");
		} else {
			System.out.println("Incorrecto!");
			deR = true;
		}
	}
	if (deR) {
		noR = false;
		System.out.println("Muy bien, parece que pasaste la ronda.");
		System.out.println("Mira, toma algunas monedas.");
		System.out.println(" [!]Has recibido +2 monedas[!] ");
		er.monedas += 2;
		System.out.println("");
		System.out.println("monedas:" + er.monedas);
		System.out.println("Brilla en la oscuridad, pero no es una estrella, ¿qué es?");
		System.out.println("Foco");
		System.out.println("Mochila");
		System.out.println("Reloj");
		System.out.println("Inserta A para desplegar guerreros+");
		System.out.println("Inserte B para desplegar arqueros");
		System.out.println("Inserte C para desplegar duendes");
		String ataque = scanner.nextLine().toUpperCase();
		if (ataque.equals("A")) {
			er.monedas -= 2;
		fG = true;
		} 			if (clr > er.monedas) {
			System.out.println("Perdiste");
		} else {
			System.out.println("Incorrecto!");
			fG = true;
		}
		if (fG) {
			deR = false;
			System.out.println("");
			System.out.println("Ganaste el juego");
			System.out.println(" [!]Ganaste el juego[!] ");
			pR = true;
			}
		}
	}
	}
