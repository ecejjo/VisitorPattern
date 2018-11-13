package complex.visitor;

public class Client {
	
    public static void main(String[] args) {
    	

	Ox ox = new Ox();
	V10 v10 = new V10();
	ox.accept(v10);
	
	ox = new Ox();
	V11 v11 = new V11();
	ox.accept(v11);

	ox = new Ox();
	V12 v12 = new V12();
	ox.accept(v12);
	
	
	Oy oy = new Oy();
	v10 = new V10();
	oy.accept(v10);

	oy = new Oy();
	V20 v20 = new V20();
	oy.accept(v20);	
    }	

}
