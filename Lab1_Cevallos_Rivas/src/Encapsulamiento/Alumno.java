package Encapsulamiento;


public class Alumno {
	//Atributos
	private int noControl;
	private String email;
	public String nombre, apellido;
	
	void setNoControl(int NC) {
		this.noControl = NC;
	}
	int getNoControl() {
		return noControl;
	}
	void setEmail(String EM) {
		this.email=EM;
	}
	String getEmail() {
		return email;
	}
	void verDatos() {
		System.out.println("No. de Control: "+ noControl);
		System.out.println("Nombre: "+ nombre);
		System.out.println("Apellidos: "+ apellido);
		System.out.println("Email: "+ email);
	}
}
