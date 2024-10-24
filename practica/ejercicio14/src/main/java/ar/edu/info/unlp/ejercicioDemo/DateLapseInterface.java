package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface DateLapseInterface {
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
	public boolean overlaps(DateLapseInterface anotherDateLapse);
	public boolean equals(DateLapseInterface o);
}
