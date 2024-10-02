package ar.edu.info.unlp.ejercicioDemo;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateLapseInterface{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	@Override
	public LocalDate getFrom() {
		return from;
	}
	@Override
	public LocalDate getTo() {
		return to;
	}
	@Override
	public int sizeInDays() {
		return (int)ChronoUnit.DAYS.between(from, to);
	}
	@Override
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(from) || other.isEqual(from)) &&
				(other.isBefore(to) || other.isEqual(to));
	}
}
