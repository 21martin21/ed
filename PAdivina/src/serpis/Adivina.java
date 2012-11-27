package serpis;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Genera un número aleatorio entre 1 y 1000
		// Pide al usuario que introduzca por teclado un número entre 1 y 1000
		// El juego acaba cuando el usuario encuentra el número aleatorio.
		// Nota: se le va dando como pista si es mayor o menor.
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		
		System.out.println("numeroAleatorio="+numeroAleatorio);
		
		int contadorIntentos = 1;
		
		int numeroUsuario;
		
		Scanner scanner = new Scanner(System.in); //escaner asociado al teclado
		
		while (true) {
			//System.out.print("Introduce un número (intento " + contadorIntentos + "): ");
			System.out.printf("Introduce un número (intento %d): ", contadorIntentos);
			String linea = scanner.nextLine();
			System.out.printf("Has escrito: %s. ", linea);
			numeroUsuario = Integer.parseInt(linea);
			
			if (numeroUsuario == numeroAleatorio)
				break;
			else if (numeroUsuario < numeroAleatorio)
				System.out.println("Prueba con uno mayor.");
			else // numeroUsuario > numeroAleatorio 
				System.out.println("Prueba con uno menor.");
			
			contadorIntentos++; //parecido a contadorIntentos = contadorIntentos + 1;
		}
		
		System.out.printf("Has acertado en el intento %d. Fin.", contadorIntentos);

	}

}
