package lampada;

public final class Lampada {
	
	private String estadoDalampada; // atributoo

	public Lampada() { // constructor - sorce + genertate using
		super();
		this.estadoDalampada = "Apagada"; //parametros - precisa ser iniciado 
		
	}
	
	public String getEstadoDalampada() {
		return estadoDalampada;
	}

	public void setEstadoDalampada(String estadoDalampada) {
		this.estadoDalampada = estadoDalampada;
	}

	public void acende() { //métodos - função 
		this.estadoDalampada = "Acesa"; 
	}
	
	public void apagada() {
		this.estadoDalampada = "Apagado"; 
	}
	
	public void mostreEstado() {
		System.out.println("Estado da lampada: " + this.estadoDalampada);
	}
}
