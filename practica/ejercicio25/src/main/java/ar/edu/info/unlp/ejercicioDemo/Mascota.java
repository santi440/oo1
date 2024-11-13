package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	private String nombre;
	private LocalDate nacimiento;
	private String especie;
	private List<ServicioMedico> consultas;
	
	public Mascota(String nombre, LocalDate nacimiento, String especie, List<ServicioMedico> consultas) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.especie = especie;
		this.consultas = new ArrayList<ServicioMedico>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public String getEspecie() {
		return especie;
	}

	public Vacunacion agregarVacu(Medico m, String nombre, double costo) {
		Vacunacion aux= new Vacunacion(this,m,"Viruela", 200,LocalDate.now());
		this.consultas.add(aux);
		return aux;
	}
	public ServicioDeGuardia agregarGuardia() {
		ServicioDeGuardia aux= new ServicioDeGuardia(this, 2,LocalDate.now());
		this.consultas.add(aux);
		return aux;
	}
	
	public Consulta agregarConsulta(Medico m) {
		Consulta aux= new Consulta(m,this,LocalDate.now());
		this.consultas.add(aux);
		return aux;
	}
	
	public boolean moreFive(){
		return this.consultas.stream().count() >= 5;
	}
	public double recaudacion(LocalDate inicio,LocalDate fin) {
		return this.consultas.stream().mapToDouble(s -> s.costo()).sum();
	}
}
