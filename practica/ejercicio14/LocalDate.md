## Fecha determinada

```
LocalDate fechaEspecifica = LocalDate.of(1972,09,15);
```

## Verificar si la fecha de hoy está entre dos fechas

```
LocalDate hoy = LocalDate.now();
LocalDate fechaInicio = LocalDate.of(1972,09,15);
LocalDate fechaFin = LocalDate.of(2032,09,15);

boolean estaEntre = (hoy.isAfter(fechaInicio) || hoy.isEquals(fechaInicio)) &&
                    (hoy.isBefore(fechaFin)   || hoy.isBefore(fechaFin));

```

## Diferencia entre dos fechas

```
long diasEntre = ChronoUnit.DAYS.between(fechaInicio,fechaFin);
long mesesEntre = ChronoUnit.MONTH.between(fechaInicio,fechaFin);
long añosEntre = ChronoUnit.YEARS.between(fechaInicio,fechaFin);
```

