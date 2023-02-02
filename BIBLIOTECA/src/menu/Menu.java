package menu;

public class Menu {

	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMO = 3;
	public static final int SALIR_PRINCIPAL = 4;
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int VER_LIBROS = 3;
	public static final int MODIFICAR_LIBRO = 4;
	public static final int VOLVER_LIBRO = 5;
	
	public static final int VER_SOCIOS = 1;
	public static final int VOLVER_SOCIOS = 2;
	
	public static final int REALIZAR_PRESTAMO = 1;
	public static final int VOLVER_PRESTAMO = 2;
	
	public static void Menu_principal() {
		
		System.out.println("---------------------");
		System.out.println(GESTIONAR_LIBROS+".- Gestionar Libros");
		System.out.println(GESTIONAR_SOCIOS+".- Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMO+".- Gestionar Prestamos");
		System.out.println(SALIR_PRINCIPAL+".- Salir");
		System.out.println("---------------------");
	}
	public static void Menu_libros() {
		
		System.out.println("---------------------");
		System.out.println(INSERTAR_LIBRO+".- Insartar Libro");
		System.out.println(ELIMINAR_LIBRO+".- Eliminar Libro");
		System.out.println(VER_LIBROS+".- Ver libros");
		System.out.println(MODIFICAR_LIBRO+".- Modificar Libro");
		System.out.println(VOLVER_LIBRO+".- Volver al principal");
		System.out.println("---------------------");
	}
	public static void Menu_socios() {
		
		System.out.println("---------------------");
		System.out.println(VER_SOCIOS+".- Ver socios");
		System.out.println(VOLVER_SOCIOS+".- Volver al principal");
		System.out.println("---------------------");
	}
	public static void Menu_prestamos() {
		
		System.out.println("---------------------");
		System.out.println(REALIZAR_PRESTAMO+".- Realizar prestamo");
		System.out.println(VOLVER_PRESTAMO+".- Volver al principal");
		System.out.println("---------------------");
	}
}
