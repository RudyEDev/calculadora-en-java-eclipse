package sem1;

public class Alumno extends Persona {
	
	double nota1;
	double nota2;	
	
	public Alumno(String nombre, String apellido, int codigo, String sexo, int dni, double nota1, double nota2) {
		super(nombre, apellido, codigo, sexo, dni);
		this.nota1 = nota1;
		this.nota2 = nota2;
		// TODO Auto-generated constructor stub

	}	

	
	public double calcularPromedio() {
		return (nota1+nota2) / 2.0;		
	}
	
	
	public String generarCorreo() {
		return getCodigo() +"@ senati.pe";
	}


	public double getNota1() {
		return nota1;
	}


	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}


	public double getNota2() {
		return nota2;
	}


	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	
}