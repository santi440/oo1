package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.*;

public class Empleado {
	private String nombre;
	private String apellido;
	private String CUIL;
	private LocalDate fechaDeNacimiento;
	private boolean hijos;
	private boolean conyuge;
	private List<Contrato> contratos;
	
	public Empleado(String nombre, String apellido, String CUIL, LocalDate fechaDeNacimiento, 
			boolean hijos, boolean conyuge) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.hijos = hijos;
		this.conyuge = conyuge;
		this.contratos = new ArrayList<Contrato>();
	}
	
	public boolean addContrato(Contrato nuevo) {
		//contains nuevo ? para evitar que carguen el mismo contrato no vigente
		// pregunto por que no tenga un contrato en ese momento?
		if(contratos.stream().noneMatch(c -> c.isVigente()) && !contratos.contains(nuevo)){
			return contratos.add(nuevo);
		}
		return false;
	}
	
	private int antiguedad(){
		return contratos.stream().mapToInt(c -> c.getTiempo()).sum();
	}
	
	private double total(int ant, double salary) { //podria ir en recibo pero prefiero 
		//dejarla como clase de datos y que no calcule nada
		/*5 años 30%, 10 años 50%, 15 años 70%, 20
		años 100%*/
		if (ant >= 20 ) return salary + salary;
		else if (ant >= 15) return salary + salary * 0.7;
		else if (ant >= 10) return salary + salary *0.5;
		else if (ant >= 5) return salary + salary *0.3;
		else return salary;
	}
	
	public Recibo emitirRecibo() {
		Contrato vigente = contratos.stream().filter(c -> c.isVigente()).findFirst().orElse(null);
		if (vigente != null) {
			int ant = this.antiguedad();
			return new Recibo(nombre, apellido, CUIL, ant, LocalDate.now(), this.total(ant , vigente.basico(conyuge, hijos)));
		}
		return null;
	}
}
