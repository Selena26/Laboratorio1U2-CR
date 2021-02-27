package abstraccion;


import java.util.Calendar;

public class ProfesorInterino extends Profesor {
	// ---------------------------------------------
	// ATRIBUTOS 
	// ---------------------------------------------
	private Calendar fechaComienzoInterinidad;
	// ---------------------------------------------
	// CONSTRUCTORES
	// ---------------------------------------------
    public ProfesorInterino (Calendar fechaInicioInterinidad) {
        super();      
        fechaComienzoInterinidad = fechaInicioInterinidad;
        }
    public ProfesorInterino (String nombre, String apellidos,
    		int edad, String id, Calendar fechaInicioInterinidad) {
    	super(nombre, apellidos, edad, id);
        fechaComienzoInterinidad = fechaInicioInterinidad;
        }
	// ---------------------------------------------
	// METODO ANALIZADOR 
	// ---------------------------------------------
    public Calendar getFechaComienzoInterinidad () {
    	return fechaComienzoInterinidad; 
    	}
	// ---------------------------------------------
	// SOBREESCRITURA DEL METODO
	// ---------------------------------------------
    public String toString () { 
    	return super.toString().concat (" Fecha comienzo interinidad: ").concat (fechaComienzoInterinidad.getTime().toString());
    	}
	// ---------------------------------------------
	// METODO ABSTRACTO SOBREESCRITO
	// ---------------------------------------------
    public float importeNomina () { 
    	return 30f * 35.60f ; 
    	} 
}
