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
}
