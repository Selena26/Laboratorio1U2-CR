package abstraccion;
import java.util.ArrayList; import java.util.Iterator;

public class ListinProfesores {
	// ---------------------------------------------
	// ATRIBUTOS 
	// ---------------------------------------------
	/**
	 * Variable de tipo profesor que almacena la lista 
	 * de profesores en el contenedor Arraylist
	 */
	private ArrayList <Profesor> listinProfesores;
	// ---------------------------------------------
	// CONSTRUCTOR 
	// ---------------------------------------------
	/**
	 * Constructor sin parametros
	 * Inicializa la varibale  
	 */
    public ListinProfesores () { 
    	listinProfesores = new ArrayList <Profesor> ();  
    	} 
	// ---------------------------------------------
	// METODOS FUNCIONALES
	// ---------------------------------------------
    /**
     * Agregar profesor al listin
     * @param profesor
     */
    public void addProfesor (Profesor profesor) {  
    	listinProfesores.add(profesor);  
    	} 
    /**
     * Imprimir listin
     */
    public void imprimirListin() {  
        String tmpStr1 = "";
        System.out.println ("Se procede a mostrar los datos de los profesores existentes en el listín \n");
        for (Profesor tmp: listinProfesores) {     
        	System.out.println (tmp.toString () );
        	if (tmp instanceof ProfesorInterino) {
        		tmpStr1 = "Interino";
        		} 
        	else { 
        		tmpStr1 = "Titular"; 
        		}
        	System.out.println("-Tipo de este profesor:"+tmpStr1+" -Nómina de este profesor: "+(tmp.importeNomina())+ "\n");
        	}
        }
    /**
     * Importe Nomina Profesorado
     * @return
     */
    public float importeTotalNominaProfesorado() {
        float importeTotal = 0f; 
        Iterator<Profesor> it = listinProfesores.iterator();
        while (it.hasNext() ) { importeTotal = importeTotal + it.next().importeNomina(); }
        return importeTotal;         
    } 
}
