package gestorBBDD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;

public class GestorBBDD extends Conexion {

	public void InsertarLibro(Libro libro) {

		String lineaInsertar = "INSERT INTO Libros (titulo, autor, num_pag) VALUES (?,?,?)";

		try {
			PreparedStatement st = super.cn.prepareStatement(lineaInsertar);
			st.setString(1, libro.getTitulo());
			st.setString(2, libro.getAutor());
			st.setInt(3, libro.getNum_pag());

			st.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteLibro(int id) {

		String EliminarLinea = "DELETE FROM libros WHERE id= ?";

		try {
			PreparedStatement stDelete = super.cn.prepareStatement(EliminarLinea);
			stDelete.setInt(1, id);

			stDelete.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Libro> getLibros() {

		String SelectLinea = "SELECT * FROM libros";

		ArrayList<Libro> libros = new ArrayList<Libro>();

		try {

			PreparedStatement stgetlibros = super.cn.prepareStatement(SelectLinea);
			ResultSet resultSet = stgetlibros.executeQuery(SelectLinea);

			while (resultSet.next()) {

				Libro libro = new Libro();

				libro.setId(resultSet.getInt("id"));
				libro.setTitulo(resultSet.getString("titulo"));
				libro.setAutor(resultSet.getString("autor"));
				libro.setNum_pag(resultSet.getInt("num_pag"));

				libros.add(libro);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return libros;
	}

	public void modificarLibro(Libro libro) {

		String modificar = "UPDATE libros SET titulo = ? ,autor = ? ,Num_pag = ? WHERE id = ?";

		try {
			PreparedStatement stmodificar = super.cn.prepareStatement(modificar);

			stmodificar.setString(1, libro.getTitulo());
			stmodificar.setString(2, libro.getAutor());
			stmodificar.setInt(3, libro.getNum_pag());
			stmodificar.setInt(4, libro.getId());

			stmodificar.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<Socio> getSocios() {
		
		String selectString = "SELECT * FROM socios";
		
		ArrayList<Socio> socios = new ArrayList<Socio>();
		
		try {
			
			PreparedStatement stgetsocios = super.cn.prepareStatement(selectString);
			ResultSet resultSet = stgetsocios.executeQuery(selectString);
			
			while(resultSet.next()) {
				
				Socio socio = new Socio();
				
				socio.setId(resultSet.getInt("id"));
				socio.setNombre(resultSet.getString("nombre"));
				socio.setApellido(resultSet.getString("apellido"));
				socio.setDireccion(resultSet.getString("direccion"));
				socio.setPoblacion(resultSet.getString("poblacion"));
				socio.setDni(resultSet.getInt("dni"));
				
				socios.add(socio);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return socios;
	}
	
	public void realizar_Prestamo(Prestamo prestamo) {
		
		String insertarPrestamo = "INSERT INTO prestamos (id_libro, id_socio, fecha, devuelto) VALUES (?,?,?,?)";
		
		try {
			
			PreparedStatement InsertarPrestamo = super.cn.prepareStatement(insertarPrestamo);
			
			InsertarPrestamo.setInt(1, prestamo.getId_libro());
			InsertarPrestamo.setInt(2, prestamo.getId_socio());
			InsertarPrestamo.setDate(3, prestamo.getFecha());
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
