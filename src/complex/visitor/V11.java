package complex.visitor;

public class V11 extends V10 {
	
	@Override
	public void visit(O o) {
		System.out.println("Soy V11");
		super.visit(o);
	}

	@Override
	public void visit(Ox ox) {
		System.out.println("Soy V11");
		super.visit(ox);
	}
	
	@Override
	public void visit(Oy oy) {
		System.out.println("Soy V11");
		super.visit(oy);
	}
}
