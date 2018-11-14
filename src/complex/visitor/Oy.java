package complex.visitor;

public class Oy extends O {
	
	E3 e3;
	
	public Oy() {
		e2 = new E22();
	}
	
	@Override
	public void accept(V v) {
		v.visit(this);
	}
		
	E3 getE3() {
		return e3;
	}
	
	@Override
	public String toString() {
        return "Oy object";
    }
}
