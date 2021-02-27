package abstraccion;

public class ProfesorTitular extends Profesor {

    // Constructor
	public ProfesorTitular(String nombre, String apellidos, int edad, String id) {
		super(nombre, apellidos, edad, id); 
		}
    public float importeNomina () { 
    	return 30f * 43.20f; 
    	}  //Método abstracto sobreescrito en esta clase

} //Cierre de la clase
