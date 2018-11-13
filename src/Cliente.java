
public class Cliente {
	
    public static void main(String[] args) {
    	
    	Turno turno = new Turno(0);
    	
    	System.out.println("Cambiador");
    	TurnoVisitor visitador = new Cambiador();
    	
    	turno.aceptar(visitador);    	
    	System.out.println(turno.getValue());
    	
    	turno.aceptar(visitador);
    	System.out.println(turno.getValue());
    	
    	turno.aceptar(visitador);
    	System.out.println(turno.getValue());

    	turno.aceptar(visitador);
    	System.out.println(turno.getValue());
    	
    	System.out.println("Take");
    	TurnoVisitor visitador2 = new Take();
    	turno.aceptar(visitador2);
    	
    	System.out.println(turno.getValue());
    }
}
