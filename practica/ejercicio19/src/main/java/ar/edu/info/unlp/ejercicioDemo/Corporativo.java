package ar.edu.info.unlp.ejercicioDemo;

public class Corporativo extends Cliente {
	private String CUIT;

	public Corporativo(String nombre, String direccion, String CUIT) {
		super(nombre, direccion);
		this.CUIT = CUIT;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}
	
	

}
