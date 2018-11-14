package complex.visitor;

public class V10 implements V {
	
	@Override
	public String toString() {
        return "V10 object";
    }

	@Override
	public void visit(Ox ox) {
		System.out.println("this is: " + this.toString());
		System.out.println(" - ox.a is: " + ox.getA());
		System.out.println(" - ox.b is: " + ox.getB());

		try {
			System.out.println(" - ox.e1 is: " + ox.getE1().toString());			
		}
		catch (NullPointerException e)
		{
			System.out.println(" - ox.e1 is: Null");
		}

		try {
			System.out.println(" - ox.e2 is: " + ox.getE2());			
		}
		catch (NullPointerException e)
		{
			System.out.println(" - ox.e2 is: Null");
		}
	}
	
	@Override
	public void visit(Oy oy) {
		System.out.println("this is: " + this.toString());
		System.out.println(" - oy.a is: " + oy.getA());
		
		try {
			System.out.println(" - oy.e1 is: " + oy.getE1().toString());			
		}
		catch (NullPointerException e)
		{
			System.out.println(" - oy.e1 is: Null");
		}

		try {
			System.out.println(" - oy.e2 is: " + oy.getE2().toString());
		}
		catch (NullPointerException e)
		{
			System.out.println(" - oy.e2 is: Null");
		}
		
		try {
			System.out.println(" - oy.e3 is: " + oy.getE3().toString());			
		}
		catch (NullPointerException e)
		{
			System.out.println(" - oy.e3 is: Null");
		}
	}
}
