package ar.edu.info.unlp.ejercicioDemo;

import java.util.HashSet;

public class EvenNumberSetb extends HashSet<Integer>{
	
	public boolean add(Integer num) {
		if(num % 2 == 0) {
			super.add(num);
			return true;
		}
		return false;
	}
}
