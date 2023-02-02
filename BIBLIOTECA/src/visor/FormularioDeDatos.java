package visor;

import java.util.Scanner;

import gestorBBDD.Libro;

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
	
	

}
