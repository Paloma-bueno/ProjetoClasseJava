package contabancaria;

public class PrincipalConta {

	public static void main(String[] args) {
	
		ContaBancaria c1 = new ContaBancaria("Paloma", 3000, true); 
		
		c1.deposita(100);
		c1.mostraDados();
		c1.retira(35);
		c1.mostraDados(); 
		
	}
}
