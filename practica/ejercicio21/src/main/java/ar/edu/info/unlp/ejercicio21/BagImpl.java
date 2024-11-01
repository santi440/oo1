package ar.edu.info.unlp.ejercicio21;

import java.util.*;

public class BagImpl<String> extends AbstractCollection<String> implements Bag<String> {

    Map<String, Integer> elements;

    public BagImpl() {
        // TODO Completar con la instanciación adecuada
        this.elements = new HashMap<String, Integer>(); 
    }

    @Override
    public boolean add(String element) {
        // TODO Completar con la implementación correspondiente
        if (elements.put(element, 1) == null)
        	return true;
        else
        	return elements.put(element, elements.get(element)+ 1) >=1;
    }

    @Override
    public int occurrencesOf(String element) {
        // TODO Completar con la implementación correspondiente
        Integer aux = elements.get(element);
        return (aux == null) ? 0 : aux;
    	
    }

    @Override
    public void removeOccurrence(String element) {
        // TODO Completar con la implementación correspondiente
    	int aux = this.elements.get(element);
    	if (aux == 1) {
    		this.elements.remove(element);
    	}
    	else 
    		 this.elements.put(element, aux-1);
    }

    @Override
    public void removeAll(String element) {
        // TODO Completar con la implementación correspondiente
    	this.elements.remove(element);
    }

    @Override
    public int size() {
        // TODO Completar con la implementación correspondiente
       return this.elements.entrySet().stream().mapToInt(e -> occurrencesOf(e.getKey())).sum();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private Iterator<Map.Entry<String, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<String, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public String next() {
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
