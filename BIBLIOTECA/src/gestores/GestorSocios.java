package gestores;

import java.util.ArrayList;
import java.util.Scanner;

import gestorBBDD.GestorBBDD;
import gestorBBDD.Socio;
import menu.Menu;
import visor.Visor;

public class GestorSocios {

	/**
	 * @param sc
	 */
	
	public static void run(Scanner sc) {
		
		GestorBBDD gestor = new GestorBBDD();
		
		int opc_socios;
		
		do {
			Menu.Menu_socios();
			
			opc_socios = Integer.parseInt(sc.nextLine());

			while (opc_socios < Menu.VER_SOCIOS || opc_socios > Menu.VOLVER_SOCIOS) {

				System.out.println("!Error¡ Introduce un valor valido");

				Menu.Menu_socios();

				opc_socios = Integer.parseInt(sc.nextLine());

			}
			
			switch (opc_socios) {
			case Menu.VER_SOCIOS:
				
				gestor.abrir_conexion();
				ArrayList<Socio> socios = gestor.getSocios();
				Visor.mostrarArraySocios(socios);
				gestor.cerrar_conexion();
				
				break;

			case Menu.VOLVER_SOCIOS:
				System.out.println("------Volviendo------");
				break;
			}

		} while (opc_socios != Menu.VOLVER_SOCIOS);
		
		
	}
}
