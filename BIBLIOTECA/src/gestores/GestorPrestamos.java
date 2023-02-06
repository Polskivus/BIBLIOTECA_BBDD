package gestores;

import java.util.Scanner;

import gestorBBDD.GestorBBDD;
import gestorBBDD.Prestamo;
import menu.Menu;
import visor.FormularioDeDatos;

public class GestorPrestamos {

	/**
	 * @param sc
	 */

	public static void run(Scanner sc) {
		
		GestorBBDD gestor = new GestorBBDD();
		
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
				
				Prestamo prestamo = new Prestamo();
				
				gestor.abrir_conexion();
				prestamo = FormularioDeDatos.insertar_Prestamo(sc);
				
				gestor.cerrar_conexion();
				
				break;

			case Menu.VOLVER_PRESTAMO:
				System.out.println("------Volviendo------");
				break;
			}

		} while (opc_prestamos != Menu.VOLVER_PRESTAMO);
	}

}
