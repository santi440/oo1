1. ¿Qué implementaciones provee Java para utilizar un Map? ¿Cuáles de ellas son destinadas a uso general?
	Java proporciona varias implementaciones de Map, de las cuales las más comunes y de uso general son:
    - HashMap: implementa una tabla hash, permite null en claves y valores, y no garantiza el orden de los elementos.
    - LinkedHashMap: extiende HashMap y mantiene el orden de inserción de los elementos.
    - TreeMap: implementa NavigableMap y mantiene los elementos ordenados según el orden natural de las claves o por un comparador.

2. ¿Cómo consultar si un mapa contiene una determinada clave?
	Para verificar si una clave existe en el mapa, puedes utilizar el método containsKey(Object key). Las claves deben implementar los métodos equals() y hashCode() para que la comparación funcione correctamente en HashMap y LinkedHashMap. En el caso de TreeMap, las claves deben ser comparables (o usar un comparador explícito).
3. ¿Con qué método se puede recuperar el objeto asociado a una clave? ¿Qué pasa si la clave no existe en el mapa?
	Para recuperar un valor asociado a una clave, se utiliza el método get(Object key). Si la clave no existe, get retorna null.
	
4.  ¿Cómo agregar claves y valores a un mapa? ¿Qué pasa si la clave ya se encontraba en el mapa? ¿Permite agregar claves y/o valores nulos?
	Para agregar una entrada, se usa el método put(K key, V value). Si la clave ya estaba en el mapa, put reemplaza el valor asociado con la nueva entrada y devuelve el valor anterior. En cuanto a claves y valores nulos:
	- HashMap y LinkedHashMap permiten tanto claves como valores null.
    - TreeMap no permite null en claves, pero sí en valores.

5. ¿Cómo se pueden eliminar claves y valores de un mapa? ¿Es necesario controlar la presencia de alguno de ellos?
	Para eliminar una clave junto con su valor, se usa remove(Object key), que devuelve el valor asociado o null si la clave no estaba en el mapa. No es necesario verificar la presencia de la clave, aunque puedes hacerlo con containsKey.
6. ¿Cómo reemplazar un valor en un mapa?
	Puedes reemplazar el valor asociado a una clave usando el método replace(K key, V value) o replace(K key, V oldValue, V newValue). El primero reemplaza el valor incondicionalmente, mientras que el segundo lo reemplaza solo si el valor actual es oldValue.
7. Iteración de un Map y uso de Streams
	Hay varias formas de iterar sobre un Map:
    - keySet(): devuelve un Set de claves.
    - values(): devuelve una colección de los valores.
    -  entrySet(): devuelve un Set de entradas (Map.Entry<K, V>).
	Con entrySet() y keySet() puedes usar bucles for-each. Además, entrySet() y keySet() pueden transformarse en streams (entrySet().stream()) y así permitir el procesamiento funcional.
b. 
```
import org.junit.jupiter.api.Test;
    import java.util.HashMap;
    import java.util.Map;

    import static org.junit.jupiter.api.Assertions.*;

    public class MapTest {

    @Test
    public void testMapOperations() {
        Map<String, Integer> golesJugadores = new HashMap<>();
        
        // Agregar las tuplas
        golesJugadores.put("Lionel Messi", 111);
        golesJugadores.put("Gabriel Batistuta", 56);
        golesJugadores.put("Kun Agüero", 42);

        // Eliminar "Kun Agüero"
        golesJugadores.remove("Kun Agüero");
        assertFalse(golesJugadores.containsKey("Kun Agüero"));

        // Actualizar goles de Messi
        golesJugadores.put("Lionel Messi", 112);
        assertEquals(112, golesJugadores.get("Lionel Messi"));

        // Intentar duplicar clave "Gabriel Batistuta"
        golesJugadores.put("Gabriel Batistuta", 56);
        assertEquals(56, golesJugadores.get("Gabriel Batistuta"));

        // Obtener la cantidad total de goles
        int totalGoles = golesJugadores.values().stream().mapToInt(Integer::intValue).sum();
        assertEquals(168, totalGoles); // Total esperado: 112 + 56
    }
} 
```
c.
```
import java.util.Objects;

public class Jugador {
    private String apellido;
    private String nombre;

    public Jugador(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    // Getters, equals y hashCode
    public String getApellido() { return apellido; }
    public String getNombre() { return nombre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return apellido.equals(jugador.apellido) && nombre.equals(jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellido, nombre);
    }
}
```

