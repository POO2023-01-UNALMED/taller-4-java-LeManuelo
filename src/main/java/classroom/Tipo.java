package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int tipo_asignatura;

	private Tipo(int num1) {
		tipo_asignatura = num1;
	}
}
