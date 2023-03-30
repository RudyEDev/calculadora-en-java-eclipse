package sem1;

import java.util.Scanner;
import sem1.Alumno;
import sem1.Profesor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ingreso = new Scanner (System.in);
		
		System.out.println("Ingrese el nombre del alumno: ");
		String nombre = ingreso.next();
		
		System.out.println("Ingrese el apellido del alumno: ");
		String apellido = ingreso.next();
		
		System.out.println("Ingrese el codigo del alumno: ");
		int codigo = ingreso.nextInt();
		
		System.out.println("Ingrese el sexo del alumno: ");
		String sexo = ingreso.next();
		
		System.out.println("Ingrese el DNI del alumno: ");
		int dni = ingreso.nextInt();
		
		System.out.println("Nota 1: ");
		double n1 = ingreso.nextInt();
		
		System.out.println("Nota 2: ");
		double n2 = ingreso.nextInt();
		
		
		Alumno a1 = new Alumno(nombre, apellido, codigo, sexo, dni, n1, n2);
		
		System.out.println("============================================");
		System.out.println("El nombre del estudiante es: " + a1.getNombre());
		System.out.println("El apellido del estudiante es: " + a1.getApellido());
		System.out.println("El codigo del estudiante es: " + a1.getCodigo());
		System.out.println("El sexo del estudiante es: " + a1.getSexo());
		System.out.println("El DNI del estudiante es: " + a1.getDni());
		System.out.println("--------------------------------------------");
		System.out.println("El promedio del estudiante es: " + a1.calcularPromedio());
		System.out.println("El correo del estudiante es: " + a1.generarCorreo());
		System.out.println("============================================");
		
		System.out.println("Ingrese el nombre del profesor: ");
		String nombre1 = ingreso.next();
		
		System.out.println("Ingrese el apellido del profesor: ");
		String apellido1 = ingreso.next();
		
		System.out.println("Ingrese el codigo del profesor: ");
		int codigo1 = ingreso.nextInt();
		
		System.out.println("Ingrese el sexo del profesor: ");
		String sexo1 = ingreso.next();
		
		System.out.println("Ingrese el DNI del profesor: ");
		int dni1 = ingreso.nextInt();
		
		System.out.println("Tarifa: ");
		double tarifa = ingreso.nextInt();
		
		System.out.println("Horas: ");
		double hora = ingreso.nextInt();
		
		Profesor p1 = new Profesor(nombre1, apellido1, codigo1, sexo1, dni1, hora, tarifa);
		
		System.out.println("============================================");
		System.out.println("El nombre del profesor es: " + p1.getNombre());
		System.out.println("El apellido del profesor es: " + p1.getApellido());
		System.out.println("El codigo del profesor es: " + p1.getCodigo());
		System.out.println("El sexo del profesor es: " + p1.getSexo());
		System.out.println("El DNI del profesor es: " + p1.getDni());
		System.out.println("--------------------------------------------");
		System.out.println("El promedio del profesor es: " + p1.calcularSueldo());
		System.out.println("El correo del profesor es: " + p1.generarCorreo());
		System.out.println("============================================");


	}
	
	
}
