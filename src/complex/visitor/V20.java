package complex.visitor;

public class V20 extends V {
	
	@Override
	void visit(O o) {
		System.out.println("Soy V20");
		System.out.println("ox.e1 is: " + o.getE1());
	}

	@Override
	void visit(Ox ox) {
		System.out.println("Soy V20");
		System.out.println("ox.e1 is: " + ox.getE1());
	}
	
	@Override
	void visit(Oy oy) {
		System.out.println("Soy V20");
		System.out.println("oy.e1 is: " + oy.getE1());
		System.out.println("oy.e3 is: " + oy.getE3());
	}
}
