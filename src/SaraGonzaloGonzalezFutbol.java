
public class SaraGonzaloGonzalezFutbol {
	private String aficion;
	private int numGoles;
	private String equipo;
	
	public SaraGonzaloGonzalezFutbol(String aficion,int numGoles,String equipo) {
		this.aficion=aficion;
		this.numGoles=numGoles;
		this.equipo=equipo;
	}
	
	public String getAficion() {
		return(this.aficion);
	}
	
	public void setAficion(String aficion) {
		this.aficion=aficion;
	}
	
	public int getNumGoles() {
		return(this.numGoles);
	}
	
	public void setNumGoles(int numGoles) {
		this.numGoles=numGoles;
	}
	
	public String getEquipo() {
		return(this.equipo);
	}
}
