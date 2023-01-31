package main;

import java.util.Scanner;

import gestores.GestorLibros;
import gestores.GestorPrestamos;
import gestores.GestorSocios;
import menu.Menu;

public class GestorBiblioteca {

	Scanner sc = new Scanner(System.in);

	public void run() throws ClassNotFoundException {

		int opc;

		do {

			Menu.Menu_principal();

			opc = Integer.parseInt(sc.nextLine());

			while (opc < Menu.GESTIONAR_LIBROS || opc > Menu.SALIR_PRINCIPAL) {

				System.out.println("!Error¡ Introduce un valor valido");

				Menu.Menu_principal();

				opc = Integer.parseInt(sc.nextLine());

			}

			switch (opc) {
			case 1:

				GestorLibros.run(sc);

				break;

			case 2:

				GestorSocios.run(sc);

				break;

			case 3:

				GestorPrestamos.run(sc);

				break;

			case 4:
				break;
			}
		} while (opc != 4);

	}
}
