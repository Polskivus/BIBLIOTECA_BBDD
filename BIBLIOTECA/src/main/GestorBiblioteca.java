package main;

import java.util.Scanner;

import menu.*;

public class GestorBiblioteca {

	public void run() throws ClassNotFoundException{
		
		Scanner sc = new Scanner(System.in);
	
		int opc;
		
		do {
			
			Menu.Menu_principal();
		
			opc = Integer.parseInt(sc.nextLine());
			
			switch (opc) {
			case 1:
				
				int opc_libros;
			
				Menu.Menu_libros();
			
				opc_libros = Integer.parseInt(sc.nextLine());
				
				break;

			case 2:
				
				int opc_socios;
				
				Menu.Menu_socios();
			
				opc_socios = Integer.parseInt(sc.nextLine());
				
				break;
				
			case 3:
				
				int opc_prestamos;
				
				Menu.Menu_prestamos();
				
				opc_prestamos = Integer.parseInt(sc.nextLine());
				
				break;
				
			case 4:
				break;
			}
		}while(opc != 4);
	}
}
