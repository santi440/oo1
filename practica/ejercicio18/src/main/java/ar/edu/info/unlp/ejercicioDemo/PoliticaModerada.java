package ar.edu.info.unlp.ejercicioDemo;

public class PoliticaModerada implements Politica {

	@Override
	public double reembolso(int restantes) {
		if (restantes >= 7) {
			return 1;
		}
		else if (restantes >=2) {
			return 0.5;
		}
		return 0;
	}
	
	public String toString() {
		return "Tiene una politica Moderada";
	}

}
