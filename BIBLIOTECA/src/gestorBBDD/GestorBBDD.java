package gestorBBDD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.Conexion;

public class GestorBBDD extends Conexion {

	public void InsertarLibro(Libro libro){
	
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
}
