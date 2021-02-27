package abstraccion;

public class ProfesorTitular extends Profesor {
	// ---------------------------------------------
	// CONSTRUCTOR 
	// ---------------------------------------------
	public ProfesorTitular(String nombre, String apellidos, int edad, String id) {
		super(nombre, apellidos, edad, id); 
	}
	// ---------------------------------------------
	// METODO ABSTRACTO SOBREESCRITO
	// ---------------------------------------------
    public float importeNomina () { 
    	return 30f * 43.20f; 
    } 
}
