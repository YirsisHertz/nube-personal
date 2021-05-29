package rellenar_arrays;

import java.util.Scanner;

/**
 * @author Yirsis Serrano
 *
 */
public class Rellenar {
	private static Scanner scanner = new Scanner(System.in);
	private static int a[];
	private static int limite = 3;

	private static void llenar() {

		a = new int[limite];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Ingresa el valor #" + (i + 1) + ": ");
			a[i] = scanner.nextInt();
		}

	}

	private static void mostrar() {

		if (a.length == 0) {
			System.err.println("\nTodavia no hay valores\n");
			return;
		}

		System.out.print("\nResultado: [");

		for (int i : a) {
			System.out.print(i + ", ");
		}

		System.out.println("]\n");

	}

	private static void buscar() {
		int num;

		System.out.print("Ingresa el valor a buscar: ");
		num = scanner.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (a[i] == num) {
				System.out.println("\nEl valor " + num + " esta en la posicion: " + i + "\n");
				return;
			}

		}

	}

	private static void buscarRepetidos() {
		int num;

		System.out.print("Ingresa el valor a buscar: ");
		num = scanner.nextInt();

		int repetidos = 0;

		String posiciones = "";

		for (int i = 0; i < a.length; i++) {

			if (a[i] == num) {
				repetidos++;
				posiciones += i + ", ";
			}
		}

		if (repetidos > 1) {
			System.out.println(
					"\nEl valor " + num + " se repite " + repetidos + " veces, en la posicion: " + posiciones + "\n");
			return;
		}

		System.out.println("\nEl valor solicitado no se repite o no existe, intenta con otro valor\n");

	}

	private static void agregar() {

		int[] copia = new int[a.length];

		for (int i = 0; i < copia.length; i++) {
			copia[i] = a[i];
		}

		limite++;
		a = new int[limite];

		for (int i = 0; i < a.length; i++) {

			if (i == a.length - 1) {
				System.out.print("Ingresa el nuevo valor: ");
				a[i] = scanner.nextInt();
			} else {
				a[i] = copia[i];
			}

		}

	}

	public static void main(String[] args) {

		try {

			int opcion;

			do {

				System.out.println("/==============================\\");
				System.out.println("| 1) Llenar arreglo            |");
				System.out.println("| 2) Mostrar arreglo           |");
				System.out.println("| 3) Buscar Valor              |");
				System.out.println("| 4) Buscar valores repetidos  |");
				System.out.println("| 5) Agregar nuevo valor       |");
				System.out.println("| 6) Salir                     |");
				System.out.println("\\==============================/");
				System.out.print("Selecciona tu opcion: ");

				opcion = scanner.nextInt();

				switch (opcion) {
				case 1:
					llenar();
					break;

				case 2:
					mostrar();
					break;

				case 3:
					buscar();
					break;

				case 4:
					buscarRepetidos();
					break;

				case 5:
					agregar();
					break;

				case 6:
					System.err.println("Gracias por usar el programa, vuelve pronto");
					System.exit(0);
					break;

				default:
					System.err.println("Seleccion invalida, intenta nuevamente");
					break;
				}

			} while (true);

		} catch (Exception e) {
			System.err.println("Opcion Invalida, Intenta mas tarde...");
		}
	}
}
