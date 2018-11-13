
public class Turno {
	
	int value;
	
	Turno (int value){
		this.value = value;
	}
		
	public void aceptar (TurnoVisitor visitador) {
		visitador.visit(this);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

}
