package gestores;

import java.util.Scanner;

import menu.Menu;

public class GestorPrestamos {

	/**
	 * @param sc
	 */

	public static void run(Scanner sc) {
		int opc_prestamos;

		do {

			Menu.Menu_prestamos();

			opc_prestamos = Integer.parseInt(sc.nextLine());

			while (opc_prestamos < Menu.REALIZAR_PRESTAMO || opc_prestamos > Menu.VOLVER_PRESTAMO) {

				System.out.println("!Error¡ Introduce un valor valido");

				Menu.Menu_prestamos();

				opc_prestamos = Integer.parseInt(sc.nextLine());

			}
			
			switch (opc_prestamos) {
			case Menu.REALIZAR_PRESTAMO:
				
				break;

			case Menu.VOLVER_PRESTAMO:
				System.out.println("------Volviendo------");
				break;
			}

		} while (opc_prestamos != Menu.VOLVER_PRESTAMO);
	}

}
