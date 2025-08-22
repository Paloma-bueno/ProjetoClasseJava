package contabancaria;

public class ContaBancaria {
	
	private String nomeCorrentista; 
	private float saldo; 
	private boolean contaEspecial;
	
	public ContaBancaria(String nomeCorrentista, float saldo, boolean contaEspecial) {
		super();
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
		this.contaEspecial = contaEspecial;
	} 
	
	
	
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	


	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}


	public float getSaldo() {
		return saldo;
	}


	public boolean isContaEspecial() {
		return contaEspecial;
	}


	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}



	public void deposita(float valor) {
		this.saldo = this.saldo + valor; 
	}
	
	public void retira(float valor) {
		this.saldo = this.saldo - valor; 
	}
	
	public void mostraDados() {
		System.out.println("Nome " + getNomeCorrentista() + " saldo: " + getSaldo() + " Conta Especial: " + isContaEspecial());
		
	}
}
