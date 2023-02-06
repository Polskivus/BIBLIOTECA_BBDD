package visor;

import java.util.Date;
import java.util.Scanner;

import gestorBBDD.Libro;
import gestorBBDD.Prestamo;

public class FormularioDeDatos {

	public static Libro pedirLibroNuevo(Scanner sc) {

		Libro libro = new Libro();

		System.out.println("Introduce el titulo del libro");
		libro.setTitulo(sc.nextLine());

		System.out.println("Introduce el nombre del autor");
		libro.setAutor(sc.nextLine());

		System.out.println("Introduce el numero de paginas");
		libro.setNum_pag(Integer.parseInt(sc.nextLine()));

		return libro;

	}

	public static int pedirIDLibro(Scanner sc) {

		int id_libro;

		System.out.println("Introduce el ID del libro que quieres modificar");
		id_libro = Integer.parseInt(sc.nextLine());

		return id_libro;
	}

	public static Libro modificarLibro(Libro libro, Scanner sc) {

		Libro libro_mod = new Libro();

		libro_mod.setId(pedirIDLibro(sc));

		System.out.println("Introduce el titulo correcto");
		libro_mod.setTitulo(sc.nextLine());

		System.out.println("Introduce el autor correcto");
		libro_mod.setAutor(sc.nextLine());

		System.out.println("Introduce el numero de paginas");
		libro_mod.setNum_pag(Integer.parseInt(sc.nextLine()));

		return libro_mod;
	}

	public static Prestamo insertar_Prestamo(Scanner sc) {

		String fecha;
		
		Prestamo prestamo = new Prestamo();

		System.out.println("Introduce el id del libro que quieres prestar");
		prestamo.setId_libro(Integer.parseInt(sc.nextLine()));

		System.out.println("Identificate");
		prestamo.setId_socio(Integer.parseInt(sc.nextLine()));

		fecha = prestamo.getFecha();
		prestamo.setFecha(fecha);
		
		prestamo.setDevuelto(0);

		return prestamo;
	}

}
