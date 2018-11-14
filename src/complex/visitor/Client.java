package complex.visitor;

public class Client {
	
    public static void main(String[] args) {

    Ox ox = new Ox();
	Oy oy = new Oy();
	
	V10 v10 = new V10();
	ox.accept(v10);
	
	V11 v11 = new V11();
	ox.accept(v11);

	V12 v12 = new V12();
	ox.accept(v12);

	v10 = new V10();
	oy.accept(v10);

	V20 v20 = new V20();
	oy.accept(v20);
	
	oy.e3 = new E3();
	oy.accept(v20);
	
    }	
}
