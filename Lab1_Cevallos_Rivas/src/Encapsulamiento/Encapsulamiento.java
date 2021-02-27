package Encapsulamiento;


public class Encapsulamiento {

	public static void main(String[] args) {
		
		Alumno alu1=new Alumno();
		Alumno alu2=new Alumno();
		
		//Datos para Alumno 1
		System.out.println("--------");
		alu1.setNoControl(12345);
		alu1.nombre = "Joan";
		alu1.apellido = "Cevallos";
		alu1.setEmail("jfcevallos7@ese.edu.ec");
		alu1.verDatos();
		
		//Datos para Alumno 2
		System.out.println("--------");
		alu1.setNoControl(12345);
		alu1.nombre = "Selena";
		alu1.apellido = "Rivas";
		alu1.setEmail("servas@espe.edu.ec");
		alu1.verDatos();
		

	}

}
