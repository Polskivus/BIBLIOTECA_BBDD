package menu;

public class Menu {

	public static void Menu_principal() {
		
		System.out.println("---------------------");
		System.out.println("1.- Gestionar Libros");
		System.out.println("2.- Gestionar Socios");
		System.out.println("3.- Gestionar Prestamos");
		System.out.println("4.- Salir");
	}
	public static void Menu_libros() {
		
		System.out.println("---------------------");
		System.out.println("1.- Insartar Libro");
		System.out.println("2.- Eliminar Libro");
		System.out.println("3.-Ver libros");
		System.out.println("4.- Volver al principal");
	}
	public static void Menu_socios() {
		
		System.out.println("---------------------");
		System.out.println("1.- Ver socios");
		System.out.println("2.- Volver al principal");
	}
	public static void Menu_prestamos() {
		
		System.out.println("---------------------");
		System.out.println("1.- Realizar prestamo");
		System.out.println("2.- Volver al principal");
	}
}
