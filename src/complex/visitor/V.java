package complex.visitor;

public class V {
	
	void visit(O o) {
		o.accept(this);
	}
	
	void visit(Ox ox) {
		ox.accept(this);
	}

	void visit(Oy oy) {
		oy.accept(this);
	}

}
