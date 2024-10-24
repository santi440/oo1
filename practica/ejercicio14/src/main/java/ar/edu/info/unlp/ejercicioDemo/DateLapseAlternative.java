package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class DateLapseAlternative implements DateLapseInterface{
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseAlternative(LocalDate from, int days) {
		this.from = from;
		this.sizeInDays = days;
	}
	
	@Override
	public LocalDate getFrom() {
		return from;
	}
	@Override
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}
	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}
	@Override
	public boolean includesDate(LocalDate other) {
		LocalDate to = getTo();
		return (other.isAfter(from) || other.isEqual(from)) &&
				(other.isBefore(to) || other.isEqual(to));
	}
	/**
	Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
	**/
	public boolean overlaps (DateLapseInterface anotherDateLapse) {
		return (this.includesDate(anotherDateLapse.getFrom()) || this.includesDate(anotherDateLapse.getTo()));
	}
	
	public boolean equals(DateLapseInterface o) {
		return this.from.equals(o.getFrom()) && this.getTo().equals(o.getTo());
	}
}
