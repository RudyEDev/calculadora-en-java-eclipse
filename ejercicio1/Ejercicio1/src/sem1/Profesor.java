package sem1;

public class Profesor extends Persona{
	
	double tarifa;
	double hora;	
	
	public Profesor(String nombre, String apellido, int codigo, String sexo, int dni, double hora, double tarifa) {
		super(nombre, apellido, codigo, sexo, dni);
		// TODO Auto-generated constructor stub
		this.hora = hora;
		this.tarifa = tarifa;
	}

	
	public String generarCorreo() {
		return getNombre() + "@ senati.pe";		
	}
	
	public double calcularSueldo() {
		return hora * tarifa;		
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	

}
