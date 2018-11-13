package complex.visitor;

public class Ox extends O {
	
	int b;
	
	public Ox() {
		b = 88;
		e2 = new E21();
	}

	public int getB() {
		return b;
	}

	public E2 getE2() {
		return e2;
	}

	@Override
	public void accept(V v) {
		v.visit(this);
	}

}
