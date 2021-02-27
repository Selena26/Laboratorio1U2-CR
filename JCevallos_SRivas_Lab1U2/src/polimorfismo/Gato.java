package polimorfismo;

public class Gato extends Animal{
	// ---------------------------------------------
	// CONSTRUCTOR 
	// ---------------------------------------------
	/**
	 * Constructor explicito clase Gato
	 * @param nombre
	*/
	public Gato(String nombre) {
		 super(nombre);
		 System.out.println("Constructor Gato, nombre : "+nombre);
	}
	// ---------------------------------------------
	// METODOS FUNCIONALES
	// ---------------------------------------------
	public void tipoAnimal() {
		 System.out.println("Tipo Animal : Es un Gato");
	}
	public void comunicarse(){
		 System.out.println("Metodo comunicarse : El gato maulla... Miau Miau");
	}
}
