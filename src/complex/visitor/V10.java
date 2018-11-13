package complex.visitor;

public class V10 extends V {
	
	@Override
	void visit(O o) {
		System.out.println("Soy V10");
		System.out.println("o.a is: " + o.getA());
		System.out.println("ox.e1 is: " + o.getE1());
		System.out.println("ox.e2 is: " + o.getE2());
	}

	@Override
	void visit(Ox ox) {
		System.out.println("Soy V10");
		System.out.println("ox.a is: " + ox.getA());
		System.out.println("ox.b is: " + ox.getB());
		System.out.println("ox.e1 is: " + ox.getE1());
		System.out.println("ox.e2 is: " + ox.getE2());
	}
	
	@Override
	void visit(Oy oy) {
		System.out.println("Soy V10");
		System.out.println("oy.a is: " + oy.getA());
		System.out.println("oy.e1 is: " + oy.getE1());
		System.out.println("oy.e2 is: " + oy.getE2());
		System.out.println("oy.e3 is: " + oy.getE3());
	}

}
