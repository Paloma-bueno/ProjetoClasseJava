package lampada;

public class Principal {

	public static void main(String[] args) {
		
		Lampada l1 = new Lampada(); 
		l1.mostreEstado();
		l1.acende(); 
		
		System.out.println(l1.getEstadoDalampada());
		l1.apagada(); 
		
		System.out.println(l1.getEstadoDalampada());
		
		l1.mostreEstado();
		
	}
	
	
	
}
