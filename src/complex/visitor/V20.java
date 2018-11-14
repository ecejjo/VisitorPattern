package complex.visitor;

public class V20 implements V {
	
	@Override
	public String toString() {
        return "V20 object";
    }

	@Override
	public void visit(Ox ox) {
		System.out.println("this is: " + this.toString());
		
		try {
			System.out.println(" - ox.e1 is: " + ox.getE1().toString());			
		}
		catch (NullPointerException e)
		{
			System.out.println(" - ox.e1 is: Null");
		}

	}
	
	@Override
	public void visit(Oy oy) {
		System.out.println("this is: " + this.toString());
		
		try {
			System.out.println(" - oy.e1 is: " + oy.getE1().toString());			
		}
		catch (NullPointerException e)
		{
			System.out.println(" - oy.e1 is: Null");
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
