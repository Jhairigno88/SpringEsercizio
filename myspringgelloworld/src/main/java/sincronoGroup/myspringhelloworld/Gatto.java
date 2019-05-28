package sincronoGroup.myspringhelloworld;

public class Gatto {

	private String risposta;
	
	public void getRisposta() {
		System.out.println("il gatto risponde: " +risposta);
	}
	public void setRisposta(String risposta) {
		this.risposta = risposta;
	}
	
	private String scappa;
	
	public void getScappa() {
		System.out.println("il gatto scappa "+scappa);
	}
	public void setScappa(String scappa) {
		this.scappa=scappa;
	}
}
