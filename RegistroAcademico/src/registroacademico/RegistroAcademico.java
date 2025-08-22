package registroacademico;

public class RegistroAcademico {

	private String nomeAluno; 
	private int numeroMatricula; 
	private boolean eBolsista;
	
	
	public RegistroAcademico(String nomeAluno, int numeroMatricula, boolean eBolsista) {
		super();
		this.nomeAluno = nomeAluno;
		this.numeroMatricula = numeroMatricula;
		this.eBolsista = eBolsista;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}


	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}


	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}


	public boolean iseBolsista() {
		return eBolsista;
	}


	public void seteBolsista(boolean eBolsista) {
		this.eBolsista = eBolsista;
	} 
	
	
	public void mostraRegistro() {
		System.out.println("Nome: " + getNomeAluno() + " Matricula: " + getNumeroMatricula() + " Bolsista: " + iseBolsista());
		
	}
	

}
