package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int tipo_asignatura;

	private Tipo(int numero1) {
		tipo_asignatura = numero1;
	}
}
