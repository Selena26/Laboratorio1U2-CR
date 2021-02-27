package abstraccion;

public class Persona { 
	// ---------------------------------------------
	// ATRIBUTOS 
	// ---------------------------------------------
	private String nombre; 
	private String apellidos; 
	private int edad;
	// ---------------------------------------------
	// CONSTRUCTOR SIN PARAMETROS
	// ---------------------------------------------
	public Persona() { 
		nombre = "";
		apellidos = "";
		edad = 0; 
	}
	// ---------------------------------------------
	// CONSTUCTOR CON PARAMETROS 
	// ---------------------------------------------
	public Persona (String nombre, String apellidos, int edad) { 
		this.nombre = nombre;
		this.apellidos = apellidos; 
		this.edad = edad; 
	}
	// ---------------------------------------------
	// METODOS ANALIZADORES
	// ---------------------------------------------
	public String getNombre() {
		return nombre; 
	}
	
	public String getApellidos() {
		return apellidos; 
	}
	
	public int getEdad() { 
		return edad;
	}
	// ---------------------------------------------
	// SOBRE ESCRITURA DEL METODO
	// ---------------------------------------------
	public String toString() {   
		Integer datoEdad = edad;
		return "-Nombre: ".concat(nombre).concat(" -Apellidos: ").concat(apellidos).concat(" -Edad: ").concat(datoEdad.toString() );
	}  
} 
