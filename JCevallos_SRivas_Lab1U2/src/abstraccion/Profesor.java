package abstraccion;

public abstract class Profesor extends Persona {
	// ---------------------------------------------
	// ATRIBUTOS 
	// ---------------------------------------------
	private String IdProfesor; 
	// ---------------------------------------------
	// CONSTRUCTOR SIN PARAMETROS
	// ---------------------------------------------
	public Profesor () { 
		   super();      
		   IdProfesor = "Unknown"; 
	}
	// ---------------------------------------------
	// CONSTRUCTOR CON PARAMETROS
	// ---------------------------------------------
	public Profesor (String nombre, String apellidos, int edad, String id) { 
	   super(nombre, apellidos, edad);
	   IdProfesor = id; 
	}
	// ---------------------------------------------
	// METODOS ANALIZADORES
	// ---------------------------------------------
	public void setIdProfesor (String IdProfesor) {
		this.IdProfesor = IdProfesor;   
		}
	public String getIdProfesor () { 
		return IdProfesor;   
		}
	// ---------------------------------------------
	// METODO FUNCIONAL
	// ---------------------------------------------
	public void mostrarDatos() {
		System.out.println ("Datos Profesor. Profesor de nombre: " + getNombre() + " " +
	getApellidos() + " con Id de profesor: " + getIdProfesor() );  
		}
	public String toString () { 
		return super.toString().concat(" -IdProfesor: ").concat(IdProfesor);
		}
	// ---------------------------------------------
	// METODO ABSTRACTO 
	// ---------------------------------------------
	abstract public float importeNomina ();  

} 