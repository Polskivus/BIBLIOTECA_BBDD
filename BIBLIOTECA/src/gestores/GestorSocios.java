package gestores;

import java.util.Scanner;

import menu.Menu;

public class GestorSocios {

	/**
	 * @param sc
	 */
	
	public static void run(Scanner sc) {
		
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
				
				break;

			case Menu.VOLVER_SOCIOS:
				System.out.println("------Volviendo------");
				break;
			}

		} while (opc_socios != Menu.VOLVER_SOCIOS);
		
		
	}
}
