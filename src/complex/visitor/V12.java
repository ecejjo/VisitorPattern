package complex.visitor;

public class V12 extends V10 {
	
	@Override
	public void visit(O o) {
		System.out.println("Soy V12");
		super.visit(o);
	}

	@Override
	public void visit(Ox ox) {
		System.out.println("Soy V12");
		super.visit(ox);
	}
	
	@Override
	public void visit(Oy oy) {
		System.out.println("Soy V12");
		super.visit(oy);
	}

}
