package Herencia;

public class ClaseHerencia {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("Selena Rivas", 21, 1400, "123456789", "Pan de Vivienda");
		Empleado emp2 = new Empleado("Joan Cevallos", 22, 1400, "987654321", "Coop. Gran Colombia");
		emp1.verDatos();
		emp2.verDatos();
		

	}

}
