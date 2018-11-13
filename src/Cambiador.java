
public class Cambiador extends TurnoVisitor {
	
	public void visit(Turno turno) {
		turno.value = (turno.value + 1) % 2;
	}

}
