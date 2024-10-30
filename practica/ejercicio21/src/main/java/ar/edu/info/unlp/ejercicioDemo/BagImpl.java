package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
        // TODO Completar con la instanciación adecuada
        this.elements = new HashMap<T, Integer>(); 
    }

    @Override
    public boolean add(T element) {
        // TODO Completar con la implementación correspondiente
        return elements.put(element, 1) == 1;
    }

    @Override
    public int occurrencesOf(T element) {
        // TODO Completar con la implementación correspondiente
        return elements.get(element);
    }

    @Override
    public void removeOccurrence(T element) {
        // TODO Completar con la implementación correspondiente
    	int aux = this.elements.get(element);
    	if (aux == 1) {
    		this.elements.remove(element);
    	}
    	else 
    		 this.elements.put(element, aux-1);
    }

    @Override
    public void removeAll(T element) {
        // TODO Completar con la implementación correspondiente
    	this.elements.remove(element);
    }

    @Override
    public int size() {
        // TODO Completar con la implementación correspondiente
       return this.elements.values().stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
