package ar.edu.info.unlp.ejercicioDemo;

import java.util.Set;
import java.util.HashSet;
public class EvenNumberSet{
	private Set<Integer> elem;
	
	public EvenNumberSet() {
		this.elem = new HashSet<Integer>();
	}

	public int size() {
		return elem.size();
	}
	
	public boolean add(Integer num) {
		if(num % 2 == 0) {
			elem.add(num);
			return true;
		}
		return false;
	}
	
}