
public class Take extends TurnoVisitor {

	Turno turno;
	
	@Override
	public void visit(Turno turno) {
		this.turno = turno;
	}
	
	public int getResult()
	{
		return turno.getValue();
	}
}
