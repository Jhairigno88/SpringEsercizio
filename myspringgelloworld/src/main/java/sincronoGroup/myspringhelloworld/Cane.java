package sincronoGroup.myspringhelloworld;

public class Cane {
	
	private String verso;

	public void getVerso() {
		System.out.println("Il cane fa: "+verso);
		
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}
	
	private String vedere;
	
	public void GetVedere() {
		System.out.println("il cane ha visto "+vedere);
	}
	
	public void setVedere(String vedere) {
		this.vedere= vedere;
	}
	
	public String rincorre;
	
	public void getRincorre() {
		System.out.println("il cane rincorre " + rincorre);
	}
	
	public void setRincorre(String rincorre) {
		this.rincorre= rincorre;
	}
	

}
