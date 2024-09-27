package ar.edu.info.unlp.ejercicio6;
import java.time.LocalDate;
public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre,madre;
	
	public Mamifero (String unIdentificador) {
		this.identificador = unIdentificador;
	}
	
	public Mamifero () {
		
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		return (this.madre != null) ? this.madre.getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return (this.madre != null) ? this.madre.getMadre() : null;
	}
	public Mamifero getAbueloPaterno() {
		return (this.padre != null) ? this.padre.getPadre() : null;
	}
	public Mamifero getAbuelaPaterna() {
		return (this.padre != null) ? this.padre.getMadre() : null;
	}
	
	/*public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if ((this.padre != null && this.padre.equals(unMamifero)) || 
			(this.madre != null && this.madre.equals(unMamifero))) {
			return true;
		}
		else
			if ((this.padre!= null && this.padre.tieneComoAncestroA(unMamifero)) ||
				(this.madre!= null && this.madre.tieneComoAncestroA(unMamifero))) {
				return true;
			}
		return false;
	}
	*/
	
	//SOBREESCRIO EQUALS ??????
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean encontre = false;
		if ((this.padre != null && this.padre.equals(unMamifero)) || 
			(this.madre != null && this.madre.equals(unMamifero))) {
			encontre = true;
		}
		else
			if ((!encontre && this.padre!= null && this.padre.tieneComoAncestroA(unMamifero)) ||
				(!encontre && this.madre!= null && this.madre.tieneComoAncestroA(unMamifero))) {
				encontre= true;
			}
		return encontre;
	}
	
}
