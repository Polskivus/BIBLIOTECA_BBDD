package conexion;

import java.sql.*;

public class Conexion {

	protected Connection cn;

	public Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public Connection getCn() {
		return cn;
	}

	public void setCn(Connection cn) {
		this.cn = cn;
	}

	public void abrir_conexion() {

		try {

			String url = "jdbc:mysql://localhost/biblioteca2";
			cn = (Connection) DriverManager.getConnection(url, "root", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cerrar_conexion() {
		try {
			cn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
