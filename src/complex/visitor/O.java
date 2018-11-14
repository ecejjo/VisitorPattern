package complex.visitor;

public abstract class O {
	
	int a;
	E1 e1;
	E2 e2;
	
	public O() {
		a = 9;
	}
	
	public abstract void accept(V v);

	public int getA() {
		return a;
	}

	public E1 getE1() {
		return e1;
	}
	
	public E2 getE2() {
		return e2;
	}
	
	@Override
	public String toString() {
        return "O object";
    }
}
