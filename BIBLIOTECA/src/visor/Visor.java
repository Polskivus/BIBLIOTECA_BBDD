package visor;

import java.util.ArrayList;

import conexion.Conexion;
import gestorBBDD.*;

public class Visor {

	public static void MostrarArrayLibros(ArrayList<Libro> libros) {

		for (Libro libro : libros) {
			System.out.println(libro);
		}

	}
	
	static void mostrarLibro(Libro libro) {
		
		System.out.println("Elige el libro que quieres visualizar");
		
	}
	
	public static void mostrarArraySocios(ArrayList<Socio> socios) {
		
		for (Socio socio : socios) {
			System.out.println(socio);
		}
	}
	
}
