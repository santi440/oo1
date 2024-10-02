package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		Carpeta inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.carpetas.add(inbox);
	}
	
	public void recibir (Email email) {
		//pos 0 siempre sera inbox
		this.carpetas.get(0).recibir(email);
	}
	
	public void addFolder(Carpeta folder) {
		this.carpetas.add(folder);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().filter(carpeta -> carpeta.contiene(texto) != null)
				.findFirst().orElse(null).contiene(texto);
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(carpeta -> carpeta.getTamaño()).sum();
	}
}
