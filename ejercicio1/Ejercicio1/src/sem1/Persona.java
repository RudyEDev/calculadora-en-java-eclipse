package sem1;

public class Persona {
	
	String nombre;
	String apellido;
	int codigo = 143787;
	String sexo;
	int dni;
	
	
	public Persona (String nombre, String apellido, int codigo, String sexo, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
		this.sexo = sexo;
		this.dni = dni;
		
	}
		
	
	public String generarCorreo()	{
		return "Este mètodo sera alterado";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}

}