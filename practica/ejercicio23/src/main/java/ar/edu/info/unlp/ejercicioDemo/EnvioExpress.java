package ar.edu.info.unlp.ejercicioDemo;

public class EnvioExpress implements Envio {
	CalculadoraDeDistancia c;
	
	public EnvioExpress(CalculadoraDeDistancia c) {
		this.c=c;
	}

	@Override
	public double costoDeEnvio(String dir,String dir2) {
		// TODO Auto-generated method stub
		return 0.5*c.distanciaEntre(dir, dir2);
	}

}
