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

}
