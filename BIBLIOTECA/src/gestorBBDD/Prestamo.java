package gestorBBDD;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	int id_libro;
	int id_socio;
	String fecha = dateFormat.format(new Date());
	int devuelto;


	public Prestamo() {

	}

	public Prestamo(SimpleDateFormat dateFormat, int id_libro, int id_socio, String fecha, int devuelto) {
		super();
		this.dateFormat = dateFormat;
		this.id_libro = id_libro;
		this.id_socio = id_socio;
		this.fecha = fecha;
		this.devuelto = devuelto;
	}

	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(SimpleDateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
//	public java.sql.Date getDate(){
//		return (java.sql.Date) fecha;
//	}
//	
//	public String getStringDate() {
//		return ""+fecha;
//	}
//

	public int getDevuelto() {
		return devuelto;
	}

	public void setDevuelto(int devuelto) {
		this.devuelto = devuelto;
	}

	@Override
	public String toString() {
		return "Prestamo [dateFormat=" + dateFormat + ", id_libro=" + id_libro + ", id_socio=" + id_socio + ", fecha="
				+ fecha + ", devuelto=" + devuelto + "]";
	}

}
