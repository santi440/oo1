package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo() {
		this.inbox =  new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.carpetas.add(inbox);
	}
	
	public void recibir (Email email) {
		this.inbox.recibir(email);
	}
	
	public void addFolder(Carpeta folder) {
		this.carpetas.add(folder);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().map(carpeta -> carpeta.contiene(texto))
				.filter(email -> email != null).findFirst().orElse(null); 
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(carpeta -> carpeta.getTamaño()).sum();
	}
}
