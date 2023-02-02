package gestores;

import java.util.ArrayList;
import java.util.Scanner;

import conexion.Conexion;
import gestorBBDD.*;
import menu.Menu;

import visor.FormularioDeDatos;
import visor.Visor;

public class GestorLibros {

	/**
	 * @param sc
	 */
	public static void run(Scanner sc) {

		GestorBBDD gestor = new GestorBBDD();

		int opc_libros;

		do {
			Menu.Menu_libros();

			opc_libros = Integer.parseInt(sc.nextLine());

			while (opc_libros < Menu.INSERTAR_LIBRO || opc_libros > Menu.VOLVER_LIBRO) {

				System.out.println("!Error¡ Introduce un valor valido");

				Menu.Menu_libros();

				opc_libros = Integer.parseInt(sc.nextLine());

			}

			switch (opc_libros) {
			case Menu.INSERTAR_LIBRO:

				Libro libro = new Libro();

				gestor.abrir_conexion();
				libro = FormularioDeDatos.pedirLibroNuevo(sc);
				gestor.InsertarLibro(libro);
				gestor.cerrar_conexion();

				break;

			case Menu.ELIMINAR_LIBRO:

				int id;

				gestor.abrir_conexion();
				id = FormularioDeDatos.pedirIDLibro(sc);
				gestor.deleteLibro(id);
				gestor.cerrar_conexion();

				break;

			case Menu.VER_LIBROS:

				gestor.abrir_conexion();
				ArrayList<Libro> libros = gestor.getLibros();
				Visor.MostrarArrayLibros(libros);
				gestor.cerrar_conexion();

				break;

			case Menu.MODIFICAR_LIBRO:

				Libro libro_mod = new Libro();

				gestor.abrir_conexion();
				libro_mod = FormularioDeDatos.modificarLibro(libro_mod, sc);
				gestor.modificarLibro(libro_mod);
				gestor.cerrar_conexion();

				break;

			case Menu.VOLVER_LIBRO:
				System.out.println("------Volviendo------");
				break;

			}

		} while (opc_libros != Menu.VOLVER_LIBRO);

	}
}
