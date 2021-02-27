package polimorfismo;

public class Perro extends Animal{
	// ---------------------------------------------
	// ATRIBUTOS 
	// ---------------------------------------------
	/**
	 * @param nombre
	*/
	public Perro(String nombre) {
	   super(nombre);
	   System.out.println("Constructor perro, nombre : "+nombre);
	 }
	// ---------------------------------------------
	// METODOS FUNCIONALES
	// ---------------------------------------------
	public void tipoAnimal() {
	  System.out.println("Tipo Animal : Es un Perro");
	 }
	 
	 public void comunicarse(){
	  System.out.println("Metodo comunicarse : El perro Ladra... Guau Guau");
	 } 
}
