package polimorfismo;

public abstract class Animal{
	// ---------------------------------------------
	// ATRIBUTOS 
	// ---------------------------------------------
	 private String nombre;
	// ---------------------------------------------
	// CONSTRUCTOR CON PARAMETROS
	// ---------------------------------------------
	 /**
	  * Constructor de la clase Animal
	  * @param nombre
	  */
	 public Animal (String nombre){
		 this.nombre=nombre;
		 System.out.println("Constructor Animal, " + "nombre del animal : "+this.nombre);
	 }
	// ---------------------------------------------
	// METODOS ANALIZADORES
	// ---------------------------------------------
	 /**
	  * Retorna el valor de nombre
	  * @return
	  */
	 public String getNombre(){
	  return nombre;
	 }
	// ---------------------------------------------
	// METODO ABSTRACTO
	// ---------------------------------------------
	 /**
	  * Metodo Abstracto tipoAnimal, la implementación depende
	  * de las clases concretas que extiendan la clase Animal
	  */
	 public abstract void tipoAnimal();
}
	 

